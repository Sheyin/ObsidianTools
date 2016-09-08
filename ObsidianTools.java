package com.obsidiantools.ObsidianTools;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ObsidianTools.MODID, version = ObsidianTools.VERSION, updateJSON = ObsidianTools.UPDATE_JSON)
public class ObsidianTools
{
    public static final String MODID = "obsidiantools";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        //System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}

public class item_ObsidianPickaxe
{


}