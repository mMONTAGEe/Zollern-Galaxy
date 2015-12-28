package galaxymod.blocks.eden;

import galaxymod.ProjectNovaCore;
import galaxymod.blocks.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class EdenFlower extends BlockBush {
	
	public EdenFlower(String strTexture) {
		super(Material.plants);
		this.setBlockName("galaxymod_edenflower_" + strTexture);
		this.setBlockTextureName("galaxymod:edenflower_" + strTexture);
		setHardness(0.1F);
		setResistance(0.0F);
		setStepSound(soundTypeGrass);
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block plantBlock) {
		return plantBlock == Blocks.grass || plantBlock == Blocks.dirt
				|| plantBlock == Blocks.farmland
				|| plantBlock == BlockList.edenSurfaceRock
				|| plantBlock == BlockList.edenGrass
				|| plantBlock == BlockList.edenSoil;
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}
	
	@Override
	public CreativeTabs getCreativeTabToDisplayOn() {
		return ProjectNovaCore.novaTabBlocks;
	}
}