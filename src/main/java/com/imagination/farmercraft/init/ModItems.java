package com.imagination.farmercraft.init;

import com.imagination.farmercraft.item.BasicFood;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ModItems
{
        public static final List<Item> ITEMS = new ArrayList<Item>();

        //FOOD
        public static final Item TESTFOOD = new BasicFood("testfood", 5,3F,false);
}