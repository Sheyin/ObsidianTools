package com.lotte.obsidiantools.init;

import com.lotte.obsidiantools.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Ama on 9/8/2016.
 */

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)
public class ObsidianToolsInit {

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ObsidianToolsItemsInit.init();
        ObsidianToolsItemsInit.register();
    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }

}
