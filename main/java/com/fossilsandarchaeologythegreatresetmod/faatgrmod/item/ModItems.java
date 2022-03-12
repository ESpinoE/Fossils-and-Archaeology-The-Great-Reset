package com.fossilsandarchaeologythegreatresetmod.faatgrmod.item;

import com.fossilsandarchaeologythegreatresetmod.faatgrmod.FaATGRMod;
import com.fossilsandarchaeologythegreatresetmod.faatgrmod.paintings.ModPaintings;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.Item.Properties;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FaATGRMod.MOD_ID);

    public static final RegistryObject<Item> BIOFOSSIL = ITEMS.register("biofossil",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> DINOPEDIA = ITEMS.register("dinopedia",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> DILOPHOSAURUS_DNA = ITEMS.register("dilophosaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> BRACHIOSAURUS_DNA = ITEMS.register("brachiosaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> MOSASAURUS_DNA = ITEMS.register("mosasaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> PLESIOSAURUS_DNA = ITEMS.register("plesiosaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> STEGOSAURUS_DNA = ITEMS.register("stegosaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TRICERATOPS_DNA = ITEMS.register("triceratops_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> PTERANODON_DNA = ITEMS.register("pteranodon_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TYRANNOSAURUS_DNA = ITEMS.register("tyrannosaurus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> VELOCIRAPTOR_DNA = ITEMS.register("velociraptor_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> NAUTILUS_DNA = ITEMS.register("nautilus_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> BROKEN_DNA = ITEMS.register("broken_dna",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> BROKEN_ANCIENT_SWORD = ITEMS.register("broken_ancient_sword",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> BROKEN_ANCIENT_HELMET = ITEMS.register("broken_ancient_helmet",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> ANCIENT_FERN_SPORES = ITEMS.register("ancient_fern_spores",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> STONE_TABLET = ITEMS.register("stone_tablet",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> FROZEN_MEAT = ITEMS.register("frozen_meat",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> ANCIENT_SWORD = ITEMS.register("ancient_sword",
            () -> new SwordItem(ModItemTier.ANCIENT_SWORD, 2, 1f,
                    new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> COOKED_CHICKEN_SOUP = ITEMS.register("cooked_chicken_soup",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> RAW_CHICKEN_SOUP = ITEMS.register("raw_chicken_soup",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> ESSENCE_OF_CHICKEN = ITEMS.register("essence_of_chicken",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> MAGIC_CONCH = ITEMS.register("magic_conch",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> EMPTY_SHELL = ITEMS.register("empty_shell",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TYRANNOSAURUS_TOOTH = ITEMS.register("tyrannosaurus_tooth",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> SIO_CHIU_LE = ITEMS.register("sio_chiu_le",
            () -> new Item(new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> ANCIENT_HELMET = ITEMS.register("ancient_helmet",
            () -> new ArmorItem(ModArmorMaterial.ANCIENT_HELMET, EquipmentSlotType.HEAD,
                    new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TOOTH_DAGGER = ITEMS.register("tooth_dagger",
            () -> new SwordItem(ModItemTier.TOOTH_DAGGER, 2, 1f,
                    new Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static World register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        return null;
    }
}
