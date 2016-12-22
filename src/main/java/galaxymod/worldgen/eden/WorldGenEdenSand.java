/*******************************************************************************
 * Copyright 2016 Zollern Wolf
 * - Zollern Galaxy
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 * Steve Kung's "More Planets" mod was a big help.
 *******************************************************************************/

package galaxymod.worldgen.eden;

import galaxymod.blocks.BlockList;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenEdenSand extends WorldGenerator {
	private Block block;
	private int meta;
	private int radius;
	
	public WorldGenEdenSand(Block block, int meta, int radius) {
		this.block = block;
		this.radius = radius;
		this.meta = meta;
	}
	
	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (world.getBlock(x, y, z).getMaterial() != Material.water) {
			return false;
		} else {
			int l = rand.nextInt(this.radius - 2) + 2;
			byte b0 = 2;
			
			for (int i1 = x - l; i1 <= x + l; ++i1) {
				for (int j1 = z - l; j1 <= z + l; ++j1) {
					int k1 = i1 - x;
					int l1 = j1 - z;
					
					if (k1 * k1 + l1 * l1 <= l * l) {
						for (int i2 = y - b0; i2 <= y + b0; ++i2) {
							Block block = world.getBlock(i1, i2, j1);
							
							if (block == BlockList.edenSoil
									|| block == BlockList.edenGrass) {
								world.setBlock(i1, i2, j1, this.block,
										this.meta, 2);
							}
						}
					}
				}
			}
			return true;
		}
	}
}