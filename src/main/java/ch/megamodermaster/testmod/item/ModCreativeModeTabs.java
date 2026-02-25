package ch.megamodermaster.testmod.item;

import ch.megamodermaster.testmod.TestMod;
import ch.megamodermaster.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GAMBLING_THINGS = CREATIVE_MODE_TABS.register("gambling_things",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POKER_CHIP.get()))
                    .title(Component.translatable("creativetab.testmod.gambling_things"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.POKER_CHIP.get());
                        pOutput.accept(ModItems.CRACKED_POKER_CHIP.get());
                        pOutput.accept(ModItems.HEART_CARD.get());
                        pOutput.accept(ModItems.DIAMOND_CARD.get());
                        pOutput.accept(ModItems.SPADE_CARD.get());
                        pOutput.accept(ModItems.BROCCOLI_CARD.get());
                        pOutput.accept(ModBlocks.POKER_CHIP_BLOCK.get());
                        pOutput.accept(ModBlocks.CHIP_BLOCK.get());
                        pOutput.accept(ModBlocks.CREEPIER_POKER_CHIP_BLOCK.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> WEAPON_THINGS = CREATIVE_MODE_TABS.register("weapon_things",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STABBY_KNIFE.get()))
                    .title(Component.translatable("creativetab.testmod.weapon_things"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STABBY_KNIFE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
