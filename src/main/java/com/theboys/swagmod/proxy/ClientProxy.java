package com.theboys.swagmod.proxy;

import net.minecraft.client.renderer.block.model.ModelResouceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
    public void registerItemRenderer(Item item, int meta, String id)
    {
      ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResouceLocation(item.getRegistryName(), id));
    }
}
