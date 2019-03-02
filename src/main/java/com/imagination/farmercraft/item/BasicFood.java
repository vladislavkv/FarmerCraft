package com.imagination.farmercraft.item;

import com.imagination.farmercraft.FarmerCraft;
import com.imagination.farmercraft.init.ModItems;
import com.imagination.farmercraft.util.ModelRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class BasicFood extends ItemFood implements ModelRegister
{
    public BasicFood(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void modelRegister()
    {
        FarmerCraft.proxy.itemRenderRegister(this, 0, "inventory");
    }
}
