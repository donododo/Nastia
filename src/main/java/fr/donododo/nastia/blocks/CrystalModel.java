package fr.donododo.nastia.blocks;

import fr.donododo.nastia.core.Nastia;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CrystalModel extends AnimatedGeoModel<CrystalEntity>
{

	@Override
	public ResourceLocation getAnimationFileLocation(CrystalEntity animatable) {
		// TODO Auto-generated method stub
		return new ResourceLocation(Nastia.MOD_ID, "animations/crystal.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(CrystalEntity object) {
		// TODO Auto-generated method stub
		return new ResourceLocation(Nastia.MOD_ID, "geo/crystal.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalEntity object) {
		// TODO Auto-generated method stub
		return new ResourceLocation(Nastia.MOD_ID, "textures/block/crystal_block.png");
	}
}
