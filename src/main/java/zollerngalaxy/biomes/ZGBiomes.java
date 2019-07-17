package zollerngalaxy.biomes;

import static net.minecraftforge.common.BiomeDictionary.Type.COLD;
import static net.minecraftforge.common.BiomeDictionary.Type.DEAD;
import static net.minecraftforge.common.BiomeDictionary.Type.DRY;
import static net.minecraftforge.common.BiomeDictionary.Type.HOT;
import static net.minecraftforge.common.BiomeDictionary.Type.LUSH;
import static net.minecraftforge.common.BiomeDictionary.Type.MOUNTAIN;
import static net.minecraftforge.common.BiomeDictionary.Type.SPOOKY;
import static net.minecraftforge.common.BiomeDictionary.Type.WET;
import java.util.LinkedList;
import java.util.List;
import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import zollerngalaxy.biomes.eden.BiomeBloodDesert;
import zollerngalaxy.biomes.eden.BiomeEden;
import zollerngalaxy.biomes.eden.BiomeStoneMountains;
import zollerngalaxy.biomes.eden.BiomeTerranValley;
import zollerngalaxy.biomes.kriffon.BiomeKriffon;
import zollerngalaxy.biomes.purgot.BiomeLimbo;
import zollerngalaxy.biomes.purgot.BiomePurgot;
import zollerngalaxy.biomes.zollus.BiomeZollus;
import zollerngalaxy.lib.helpers.CommonZGRegisterHelper;
import zollerngalaxy.lib.helpers.ZGHelper;

public class ZGBiomes {
	
	public static final List<BiomeGenBaseGC> biomeList = new LinkedList<>();
	private static int totalBiomes = 0;
	
	public static Biome ZOLLUS = new BiomeZollus(new BiomeProperties("Zollus"));
	
	public static Biome KRIFFON = new BiomeKriffon(new BiomeProperties("Kriffon"));
	
	public static Biome PURGOT = new BiomePurgot(new BiomeProperties("Purgotary"));
	public static Biome LIMBO = new BiomeLimbo(new BiomeProperties("Limbo"));
	
	public static Biome EDEN_GREEN_LANDS = new BiomeEden(new BiomeProperties("Green Lands"));
	public static Biome EDEN_BLOOD_DESERT = new BiomeBloodDesert(
			new BiomeProperties("Blood Desert"));
	public static Biome EDEN_ROCK_MOUNTAINS = new BiomeStoneMountains(new BiomeProperties(
			"Rock Mountains"));
	public static Biome EDEN_TERRAN_VALLEY = new BiomeTerranValley(new BiomeProperties(
			"Terran Valley"));
	
	public static void init() {
		ZGBiomes.addBiome(ZGBiomes.ZOLLUS, COLD, DEAD, DRY);
		ZGBiomes.addBiome(ZGBiomes.KRIFFON, HOT, DEAD, DRY);
		ZGBiomes.addBiome(ZGBiomes.PURGOT, DEAD, DRY);
		ZGBiomes.addBiome(ZGBiomes.LIMBO, SPOOKY, DEAD);
		ZGBiomes.addBiome(ZGBiomes.EDEN_GREEN_LANDS, LUSH, WET);
		ZGBiomes.addBiome(ZGBiomes.EDEN_BLOOD_DESERT, HOT, DEAD, DRY, MOUNTAIN);
		ZGBiomes.addBiome(ZGBiomes.EDEN_ROCK_MOUNTAINS, MOUNTAIN, DEAD);
		ZGBiomes.addBiome(ZGBiomes.EDEN_TERRAN_VALLEY, LUSH, WET);
		
		ZGHelper.Log("Loaded a total of " + totalBiomes + " new biomes.");
	}
	
	private static void addBiome(Biome biome, BiomeDictionary.Type... biomeType) {
		CommonZGRegisterHelper.registerBiome(biome);
		CommonZGRegisterHelper.registerBiomeType(biome, biomeType);
		totalBiomes++;
	}
	
}