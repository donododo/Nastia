package fr.donododo.nastia.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.donododo.nastia.blocks.CrystalRenderer;
import fr.donododo.nastia.blocks.NastiaBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Nastia.MOD_ID)
public class Nastia {
	
	public static final String MOD_ID = "nastia";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	
	public Nastia() {
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
		
	    IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	    NastiaBlocks.BLOCKS.register(bus);
	    NastiaBlocks.ITEM_BLOCKS.register(bus);
	    NastiaBlocks.TILE_ENTITIES.register(bus);
	    
	}
	
	private void setup(final FMLCommonSetupEvent event) {

		LOGGER.info("[ Nastia ] Setup Commun.");
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		
		LOGGER.info("[ Nastia ] Setup côté Client.");
		ClientRegistry.bindTileEntityRenderer(NastiaBlocks.CRYSTAL_TILE_ENTITY.get(), CrystalRenderer::new);
	}
	
	private void serverSetup(final FMLDedicatedServerSetupEvent event) {
		
		LOGGER.info("[ Nastia ] Setup côté Serveur.");		
		
	}
	
}
