package net.nathan.mcexpanded.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.nathan.mcexpanded.MCExpanded;



public class ModSounds {
    public static final SoundEvent SHROOM_SONG = registerSoundEvent("shroom_song");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MCExpanded.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        MCExpanded.LOGGER.info("Registering Sounds for " + MCExpanded.MOD_ID);
    }
}
