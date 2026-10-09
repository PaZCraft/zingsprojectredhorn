package net.mcreator.zingsprojectredhorn.client.particle;

import net.minecraft.util.RandomSource;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;

public class KlaxonElectroParticle extends SingleQuadParticle {
	public static KlaxonElectroParticleProvider provider(SpriteSet spriteSet) {
		return new KlaxonElectroParticleProvider(spriteSet);
	}

	public static class KlaxonElectroParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public KlaxonElectroParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed, RandomSource random) {
			return new KlaxonElectroParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected KlaxonElectroParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z, spriteSet.first());
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.lifetime = (int) Math.max(1, 7 + (this.random.nextInt(50) - 25));
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public int getLightCoords(float partialTick) {
		return 15728880;
	}

	@Override
	public SingleQuadParticle.Layer getLayer() {
		return SingleQuadParticle.Layer.OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 15 + 1, 15));
		}
	}
}