package fr.donododo.nastia.blocks;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class CrystalRenderer extends GeoBlockRenderer<CrystalEntity>
{
    public CrystalRenderer(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super(rendererDispatcherIn, new CrystalModel());
    }
}