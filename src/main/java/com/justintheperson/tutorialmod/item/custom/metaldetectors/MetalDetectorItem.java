package com.justintheperson.tutorialmod.item.custom.metaldetectors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.Collection;

public class MetalDetectorItem extends Item {
    private final int blockDepth;


    public MetalDetectorItem(Settings settings, int blockDepth) {
        super(settings);
        this.blockDepth = blockDepth;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient())
        {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() +blockDepth; i++) {
                BlockState state = context.getWorld().getBlockState(positionClicked.down(i));

                if (isValuableBlock(state)) {
                    outputValuableCoordinates(
                            positionClicked.down(i),
                            player,
                            state.getBlock()
                    );

                    foundBlock = true;

                    break;
                }
            }
            if (!foundBlock){
                player.sendMessage(Text.literal("No valuables found"));
            }
        }

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found " + block.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(BlockState state) {
        return  state.isOf(Blocks.COPPER_ORE) ||
                state.isOf(Blocks.IRON_ORE) ||
                state.isOf(Blocks.GOLD_ORE) ||
                state.isOf(Blocks.DEEPSLATE_COPPER_ORE) ||
                state.isOf(Blocks.DEEPSLATE_IRON_ORE) ||
                state.isOf(Blocks.DEEPSLATE_GOLD_ORE) ||
                state.isOf(Blocks.NETHER_GOLD_ORE) ||
                state.isOf(Blocks.ANCIENT_DEBRIS);
    }
}
