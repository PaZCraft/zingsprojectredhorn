package net.mcreator.zingsprojectredhorn.entity;

import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.entity.npc.wanderingtrader.WanderingTrader;
import net.minecraft.world.entity.npc.villager.Villager;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModItems;
import net.mcreator.zingsprojectredhorn.init.ZingsProjectRedHornModEntities;

public class MaskedIllusionerEntity extends Raider implements RangedAttackMob {
	public static final EnumProxy<Raid.RaiderType> RAIDER_TYPE = new EnumProxy<>(Raid.RaiderType.class, ZingsProjectRedHornModEntities.MASKED_ILLUSIONER, new int[]{0, 3, 5, 5, 6, 5, 5, 3});

	public MaskedIllusionerEntity(EntityType<MaskedIllusionerEntity> type, Level world) {
		super(type, world);
		xpReward = 25;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ZingsProjectRedHornModItems.PARASITE_BOW.get()));
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Villager.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WanderingTrader.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, HiroEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, ZeroTwoEntity.class, false, false));
		this.goalSelector.addGoal(10, new AvoidEntityGoal<>(this, IronGolem.class, (float) 6, 2, 1.2));
		this.goalSelector.addGoal(11, new AvoidEntityGoal<>(this, Ravager.class, (float) 10, 1, 1.2));
		this.goalSelector.addGoal(12, new AvoidEntityGoal<>(this, WitherBoss.class, (float) 100, 2, 1.2));
		this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, LivingEntity.class, (float) 20));
		this.goalSelector.addGoal(14, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(15, new MoveBackToVillageGoal(this, 0.6, false));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10f) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(ServerLevel serverLevel, DamageSource source, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(serverLevel, source, recentlyHitIn);
		this.spawnAtLocation(serverLevel, new ItemStack(ZingsProjectRedHornModItems.PARASITE_BOW.get()));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.illusioner.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.illusioner.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("entity.illusioner.death"));
	}

	@Override
	public SoundEvent getCelebrateSound() {
		return SoundEvents.EMPTY;
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		ParasiteArrowEntityEntity.shoot(this, target);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	@Override
	public void applyRaidBuffs(ServerLevel serverLevel, int num, boolean logic) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);
		return builder;
	}
}