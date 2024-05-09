package com.cloudbrain.coolstuffmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(4)
            .saturationModifier(0.3f).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.JUMP, 100, 3), 1).build();
}
