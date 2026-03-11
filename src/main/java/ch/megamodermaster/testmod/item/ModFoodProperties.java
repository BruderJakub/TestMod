package ch.megamodermaster.testmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties FORTUNE_COOKIE = new FoodProperties.Builder().nutrition(2)
            .saturationModifier(3)
            .effect(new MobEffectInstance(MobEffects.LUCK, 400, 3), 0.50F)
            .effect(new MobEffectInstance(MobEffects.WITHER, 50, 20), 0.05F)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 75), 0.10F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 100, 100), 0.15F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 10), 0.10F)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, 50, 75), 0.05F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 50), 0.25F)
            .effect(new MobEffectInstance(MobEffects.POISON, 100, 20), 0.10F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 800, 100), 0.25F)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200, 50), 0.05F)
            .fast().usingConvertsTo(Items.PAPER).build();
}
