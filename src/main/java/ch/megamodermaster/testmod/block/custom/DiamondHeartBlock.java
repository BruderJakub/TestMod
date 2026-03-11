package ch.megamodermaster.testmod.block.custom;

import ch.megamodermaster.testmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class DiamondHeartBlock extends Block {
    public DiamondHeartBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos,
                                               Player pPlayer, BlockHitResult pHitResult) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity) {
            if(itemEntity.getItem().getItem() == ModItems.CRACKED_POKER_CHIP.get()) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if(itemEntity.getItem().getItem() == Items.APPLE) {
                itemEntity.setItem(new ItemStack(Items.GOLDEN_APPLE, itemEntity.getItem().getCount()));
            }
            if(itemEntity.getItem().getItem() == Items.GOLDEN_APPLE) {
                itemEntity.setItem(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
