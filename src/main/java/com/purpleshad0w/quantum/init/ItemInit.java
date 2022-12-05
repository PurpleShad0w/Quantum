package com.purpleshad0w.quantum.init;

import com.purpleshad0w.quantum.Quantum;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Quantum.MOD_ID);

    public static final RegistryObject<Item> QUANTUM_PIECE = ITEMS.register("quantum_piece",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));


    public static class ModCreativeTab extends CreativeModeTab {
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "quantum");

        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(QUANTUM_PIECE.get());
        }
    }
}
