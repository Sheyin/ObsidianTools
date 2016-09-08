package com.lotte.obsidiantools.proxy;

import com.lotte.obsidiantools.init.ObsidianToolsItemsInit;

/**
 * Created by Ama on 9/8/2016.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders()
    {
        ObsidianToolsItemsInit.registerRenders();
    }
}
