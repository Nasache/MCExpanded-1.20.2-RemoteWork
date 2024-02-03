package net.nathan.mcexpanded.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.joml.Vector3f;

public class MireEntity extends ZombieEntity {
    public MireEntity(EntityType<? extends MireEntity> entityType, World world) {
        super(entityType, world);
    }
    protected boolean burnsInDaylight() {
        return false;
    }
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_DROWNED_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_DROWNED_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_DROWNED_DEATH;
    }

    protected SoundEvent getStepSound() {
        return SoundEvents.ENTITY_DROWNED_STEP;
    }

    public boolean tryAttack(Entity target) {
        boolean bl = super.tryAttack(target);
        if (bl && this.getMainHandStack().isEmpty() && target instanceof LivingEntity) {
            float f = this.getWorld().getLocalDifficulty(this.getBlockPos()).getLocalDifficulty();
            ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 140 * (int)f), this);
        }

        return bl;
    }


    protected ItemStack getSkull() {
        return ItemStack.EMPTY;
    }

    protected Vector3f getPassengerAttachmentPos(Entity passenger, EntityDimensions dimensions, float scaleFactor) {
        return new Vector3f(0.0F, dimensions.height + 0.125F * scaleFactor, 0.0F);
    }
    public static DefaultAttributeContainer.Builder createMireAttributes() {
        return ZombieEntity.createZombieAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.12D);
    }

}
