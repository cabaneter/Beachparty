package satisfyu.beachparty.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import satisfyu.beachparty.util.BeachpartyPalmTreeGrower;

public class PalmSaplingBlock extends SaplingBlock {
    public PalmSaplingBlock() {
        super(new BeachpartyPalmTreeGrower(), Properties.copy(Blocks.ACACIA_SAPLING).noCollission().randomTicks().instabreak().sound(SoundType.GRASS));
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.SAND);
    }
}

