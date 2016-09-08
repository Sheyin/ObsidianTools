/**
 * Created by Sheyin on 9/8/2016.
 */

package com.sheyin.experiment;
import com.sheyin.experiment.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.modID, name = TutorialMod.name, version = TutorialMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class TutorialMod {
    public static final String modID = "tutorial";
    public static final String name = "Tutorial mod....?";
    public static final String version = "1.0.0";

    @Mod.Instance(modID)
    public static TutorialMod instance;
    public static Object proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

    @SidedProxy(serverSide = "com.sheyin.experiment.proxy.CommonProxy", clientSide = "com.sheyin.experiment.proxy.ClientProxy")
    public static CommonProxy proxy;
}
