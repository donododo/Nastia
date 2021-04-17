package fr.donododo.nastia.blocks;

import fr.donododo.nastia.core.Nastia;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NastiaBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Nastia.MOD_ID);
	public static final DeferredRegister<Item> ITEM_BLOCKS = DeferredRegister.create(ForgeRegistries.ITEMS, Nastia.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Nastia.MOD_ID);

	public static final RegistryObject<Block> MON_BLOC = BLOCKS.register("crystal_block", CrystalBlock::new);
	public static final RegistryObject<Item> MON_ITEM_BLOC = ITEM_BLOCKS.register("crystal_block", () -> new BlockItem(MON_BLOC.get(), (new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS))));
    public static final RegistryObject<TileEntityType<?>> CRYSTAL_TILE_ENTITY = TILE_ENTITIES.register("crystal", () -> TileEntityType.Builder.of(CrystalEntity::new, MON_BLOC.get()).build(null));
    
}
