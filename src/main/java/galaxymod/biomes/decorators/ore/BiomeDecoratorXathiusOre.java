/*******************************************************************************
 * Copyright 2015 Zollern Wolf
 * - Project Nova / Nova Galactic Final Frontier
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 *******************************************************************************/

package galaxymod.biomes.decorators.ore;

import galaxymod.blocks.BlockList;
import java.util.Random;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorXathiusOre extends BiomeDecoratorZG {
	
	private World worldObj;
	private Random randomGenerator;
	
	private int chunkX;
	private int chunkZ;
	
	private WorldGenerator prometheanGen;
	
	public BiomeDecoratorXathiusOre() {
		this.prometheanGen = new WorldGenMinableMeta(
				BlockList.xathPrometheanOre, 8, 0, false, BlockList.xathStone,
				0);
	}
	
	@Override
	public void decorate(World worldObj, Random rand, int chunkX, int chunkZ) {
		if (this.worldObj != null) {
			throw new RuntimeException("Already decorating!!");
		} else {
			this.worldObj = worldObj;
			this.randomGenerator = rand;
			this.chunkX = chunkX;
			this.chunkZ = chunkZ;
			this.genOre(7, this.prometheanGen, 4, 40);
			this.worldObj = null;
			this.randomGenerator = null;
		}
	}
	
	void genOre(int amountPerChunk, WorldGenerator worldGenerator, int minY,
			int maxY) {
		for (int var5 = 0; var5 < amountPerChunk; ++var5) {
			final int var6 = this.chunkX + this.randomGenerator.nextInt(16);
			final int var7 = this.randomGenerator.nextInt(maxY - minY) + minY;
			final int var8 = this.chunkZ + this.randomGenerator.nextInt(16);
			worldGenerator.generate(this.worldObj, this.randomGenerator, var6,
					var7, var8);
		}
	}
	
	@Override
	protected void setCurrentWorld(World world) {
		this.worldObj = world;
	}
	
	@Override
	protected World getCurrentWorld() {
		return this.worldObj;
	}
}