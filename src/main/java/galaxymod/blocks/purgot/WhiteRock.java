/*******************************************************************************
 * Copyright 2015 Zollern Wolf - Project Nova / Nova Galactic
 * Final Frontier
 * Galacticraft Add-On Mod
 * You CAN:
 * - Learn from it
 * - Use it to get ideas and concepts
 * You CAN'T:
 * - Redistribute it
 * - Claim it as your own
 ******************************************************************************/

package galaxymod.blocks.purgot;

import galaxymod.blocks.BlockList;
import galaxymod.blocks.BlockNova;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class WhiteRock extends BlockNova {
	
	public WhiteRock() {
		super("whiterock");
		this.setHardResist(2.0F, 0.4F);
	}
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
		if (entity instanceof EntityPlayer) {
			world.setBlock(x, y, z, BlockList.purgBlackRock);
		}
	}
	
}