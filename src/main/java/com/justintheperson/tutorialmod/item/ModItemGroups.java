package com.justintheperson.tutorialmod.item;

import com.justintheperson.tutorialmod.TutorialMod;
import com.justintheperson.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
                        entries.add(ModBlocks.NETHERRACK_TANZANITE_ORE);
                        entries.add(ModBlocks.ENDSTONE_TANZANITE_ORE);
                        entries.add(ModBlocks.TANZANITE_BLOCK);
                    }).build());
    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
