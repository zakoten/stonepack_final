package net.tramonto.stonepack;

import eu.pb4.polymer.core.api.block.SimplePolymerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TexturedBlock extends SimplePolymerBlock {

    private final BlockState clientState;

    public TexturedBlock(Block base, BlockState clientState, BlockBehaviour.Properties settings) {
        super(settings, base);
        this.clientState = clientState;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return clientState;
    }
}
