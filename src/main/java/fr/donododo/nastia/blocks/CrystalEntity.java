package fr.donododo.nastia.blocks;

import net.minecraft.tileentity.TileEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class CrystalEntity extends TileEntity implements IAnimatable{

	private AnimationFactory factory = new AnimationFactory(this);
	
	public CrystalEntity() {
		super(NastiaBlocks.CRYSTAL_TILE_ENTITY.get());
	}
	

	private <E extends TileEntity & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
		event.getController().transitionLengthTicks = 0;
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.unknown.new", true));
        return PlayState.CONTINUE;
    }
    
	@Override
	public void registerControllers(AnimationData data) {
		// TODO Auto-generated method stub
		 data.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
	}

	@Override
	public AnimationFactory getFactory() {
		// TODO Auto-generated method stub
		return factory;
	}

	
}
