package com.sheyin.experiment.proxy;

import com.sheyin.experiment.TutorialMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Sheyin on 9/8/2016.
 */

public class ClientProxy extends CommonProxy    {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TutorialMod.modID + ":" + id, "inventory"));
    }
}
