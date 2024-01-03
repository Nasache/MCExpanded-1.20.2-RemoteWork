package net.nathan.mcexpanded.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.nathan.mcexpanded.util.IEntityDataSaver;

public class ReturnHomeCommand {
    public static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher,
                                CommandRegistryAccess commandRegistryAccess,
                                CommandManager.RegistrationEnvironment registrationEnvironment) {
        serverCommandSourceCommandDispatcher.register(CommandManager.literal("home")
                .executes(ReturnHomeCommand::run));
    }

    public static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        IEntityDataSaver player = ((IEntityDataSaver) context.getSource().getPlayer());

        int[] homepos = player.getPersistentData().getIntArray("homepos");

        if(homepos.length != 0) {
            context.getSource().getPlayer().requestTeleport(homepos[0], homepos[1], homepos[2]);
            return 1;

        } else {
            context.getSource().sendFeedback(() -> Text.literal("No home position has been set"), false);
            return -1;
        }
    }
}
