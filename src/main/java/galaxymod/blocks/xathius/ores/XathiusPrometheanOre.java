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

package galaxymod.blocks.xathius.ores;

import galaxymod.blocks.BlockNovaOre;
import galaxymod.items.ItemList;
import java.util.Random;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

public class XathiusPrometheanOre extends BlockNovaOre {
	
	public XathiusPrometheanOre() {
		super("xathiusprometheanore");
		this.setHardResist(1.5F);
		this.setExpDrop(4, 6);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemList.prometheanCrystal;
	}
	
	@Override
	public int quantityDropped(Random par1Rand) {
		return MathHelper.getRandomIntegerInRange(par1Rand, 4, 6);
	}
	
}