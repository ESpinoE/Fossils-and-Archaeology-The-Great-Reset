package com.fossilsandarchaeologythegreatresetmod.faatgrmod.paintings;

import com.fossilsandarchaeologythegreatresetmod.faatgrmod.FaATGRMod;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPaintings {
    public static final DeferredRegister<PaintingType> PAINTING_TYPES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, FaATGRMod.MOD_ID);

    public static final RegistryObject<PaintingType> STONE_TABLET =
            PAINTING_TYPES.register("stone_tablet", () -> new PaintingType(64, 64));

    public static void register(IEventBus eventBus) {
    }
}
