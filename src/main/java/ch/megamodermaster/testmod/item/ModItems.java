package ch.megamodermaster.testmod.item;

import ch.megamodermaster.testmod.TestMod;
import ch.megamodermaster.testmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> POKER_CHIP = ITEMS.register("poker_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRACKED_POKER_CHIP = ITEMS.register("cracked_poker_chip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STABBY_KNIFE = ITEMS.register("stabby_knife",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_CARD = ITEMS.register("heart_card",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_CARD = ITEMS.register("diamond_card",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPADE_CARD = ITEMS.register("spade_card",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROCCOLI_CARD = ITEMS.register("broccoli_card",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROULETTE_DAGGER = ITEMS.register("roulette_dagger",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SPADE_OF_SPADES = ITEMS.register("spade_of_spades",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
