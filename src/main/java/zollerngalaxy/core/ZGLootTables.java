/**
 * Zollern Galaxy by @author Zollern Wolf
 * Copyright 2016 - 2025
 * You may use this code to learn from, but do not
 * claim it as your own, and do not
 * redistribute it.
 */
package zollerngalaxy.core;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import zollerngalaxy.lib.helpers.CommonZGRegisterHelper;

public class ZGLootTables {
	
	// Mobs
	public static final ResourceLocation ENTITY_MOOLUS = CommonZGRegisterHelper.registerEntityLoot("moolus");
	public static final ResourceLocation ENTITY_OINKUS = CommonZGRegisterHelper.registerEntityLoot("oinkus");
	
	// Chests
	public static final ResourceLocation CHEST_EDEN_TOWER = CommonZGRegisterHelper.registerChestLoot("edentower");
	public static final ResourceLocation CHEST_GIANT_BONE = CommonZGRegisterHelper.registerChestLoot("giantbone");
	public static final ResourceLocation CHEST_BURIED_TREASURE = CommonZGRegisterHelper.registerChestLoot("buriedtreasure");
	public static final ResourceLocation CHEST_OCEAN_TREASURE = CommonZGRegisterHelper.registerChestLoot("oceantreasure");
	public static final ResourceLocation CHEST_SHADOW_BOSS = CommonZGRegisterHelper.registerChestLoot("shadowboss");
	public static final ResourceLocation CHEST_SHADOW_SKULL = CommonZGRegisterHelper.registerChestLoot("shadowskull");
	
	// Gameplay
	public static final ResourceLocation GAMEPLAY_FISHING = CommonZGRegisterHelper.registerGameplayLoot("zgfishing");
	
	/**
	 * Generate a chest at the given coordinates with the supplied loot table.
	 * 
	 * @param world
	 * @param chestPos
	 * @param rand
	 * @param LOOT_TABLE
	 * @param isBigChest
	 */
	public static void generateChest(World world, BlockPos chestPos, Random rand, ResourceLocation LOOT_TABLE, boolean isBigChest) {
		world.setBlockState(chestPos, Blocks.CHEST.correctFacing(world, chestPos, Blocks.CHEST.getDefaultState()), 2);
		TileEntity tileentity1 = world.getTileEntity(chestPos);
		
		if (tileentity1 instanceof TileEntityChest) {
			((TileEntityChest) tileentity1).setLootTable(LOOT_TABLE, rand.nextLong());
		}
	}
	
	/**
	 * Generate a chest at the given coordinates with the supplied loot table.
	 * 
	 * @param world
	 * @param chestPos
	 * @param rand
	 * @param LOOT_TABLE
	 */
	public static void generateChest(World world, BlockPos chestPos, Random rand, ResourceLocation LOOT_TABLE) {
		generateChest(world, chestPos, rand, LOOT_TABLE, false);
	}
}