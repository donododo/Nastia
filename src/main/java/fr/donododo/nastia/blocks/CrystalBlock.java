package fr.donododo.nastia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CrystalBlock extends Block{

	
    public CrystalBlock() {
        super(Block.Properties.of(Material.STONE, MaterialColor.STONE).noOcclusion());
    }
    
    @Override
    public boolean hasTileEntity(BlockState state) {
    	return true;
    }
    
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
    	return NastiaBlocks.CRYSTAL_TILE_ENTITY.get().create();
    }

	@Override
	public BlockRenderType getRenderShape(BlockState state) {
		return BlockRenderType.ENTITYBLOCK_ANIMATED;
	}

}
