package com.justintheperson.tutorialmod.item;

import com.justintheperson.tutorialmod.TutorialMod;
import com.justintheperson.tutorialmod.item.custom.eightball.EightBallItem;
import com.justintheperson.tutorialmod.item.custom.metaldetectors.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings()));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item Eight_Ball = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().maxCount(1)));

    public static final Item METAL_DETECTOR = registerItem(
            "metal_detector",
            new MetalDetectorItem(
                    new FabricItemSettings().maxDamage(64),
                    32)
    );
    public static final Item GOLDEN_METAL_DETECTOR = registerItem("golden_metal_detector",
            new MetalDetectorItem(
                    new FabricItemSettings().maxDamage(128),
                    64)
    );
    public static final Item DIAMOND_METAL_DETECTOR = registerItem("diamond_metal_detector",
            new MetalDetectorItem(
                    new FabricItemSettings().maxDamage(256),
                    128)
    );
    public static final Item NETHERITE_METAL_DETECTOR = registerItem("netherite_metal_detector",
            new MetalDetectorItem(
                    new FabricItemSettings().maxDamage(512),
                    264)
    );

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,
                new Identifier(TutorialMod.MOD_ID, name),
                item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
