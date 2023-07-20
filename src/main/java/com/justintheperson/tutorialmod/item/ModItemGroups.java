package com.justintheperson.tutorialmod.item;

import com.justintheperson.tutorialmod.TutorialMod;
import com.justintheperson.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());
    public static final ItemGroup TANZANITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "tanzanite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tanzanite"))
                    .icon(() -> new ItemStack(ModItems.TANZANITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TANZANITE);
                        entries.add(ModItems.TANZANITE);

                        entries.add(ModBlocks.TANZANITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TANZANITE_ORE);
                        entries.add(ModBlocks.NETHER_TANZANITE_ORE);
                        entries.add(ModBlocks.END_STONE_TANZANITE_ORE);
                        entries.add(ModBlocks.TANZANITE_BLOCK);
                    }).build());

    public static final ItemGroup METAL_DETECTOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "metal_detector"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.metal_detector"))
                    .icon(() -> new ItemStack(ModItems.METAL_DETECTOR)).entries((displayContext, entries) -> {
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.GOLDEN_METAL_DETECTOR);
                        entries.add(ModItems.DIAMOND_METAL_DETECTOR);
                        entries.add(ModItems.NETHERITE_METAL_DETECTOR);
                    }).build());

    public static final ItemGroup EIGHT_BALL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "eight_ball"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eight_ball"))
                    .icon(() -> new ItemStack(ModItems.EIGHT_BALL)).entries((displayContext, entries) -> entries.add(ModItems.EIGHT_BALL)).build());

    public static final ItemGroup JUMPY_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "jumpy_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jumpy_block"))
                    .icon(() -> new ItemStack(ModBlocks.JUMPY_BLOCK)).entries((displayContext, entries) -> entries.add(ModBlocks.JUMPY_BLOCK)).build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
