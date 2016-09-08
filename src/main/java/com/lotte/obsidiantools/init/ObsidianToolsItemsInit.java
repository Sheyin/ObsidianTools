package com.lotte.obsidiantools.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ama on 9/8/2016.
 */
public class ObsidianToolsItemsInit {

    public static Item obsidian_pick;

    public static void init() { obsidian_pick = new Item().setUnlocalizedName("obsidian_pick"); }

    public static void register()
    {
        GameRegistry.registerItem(obsidian_pick, obsidian_pick.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(obsidian_pick);
    }

    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
