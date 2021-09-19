package chaosdog.frivycat;

import chaosdog.frivycat.blocks.CorruptedBlock;
import chaosdog.frivycat.blocks.MumboBlock;
import chaosdog.frivycat.blocks.MumboDustWire;
import chaosdog.frivycat.blocks.SpiritRealmPortal;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    // registries (they don't need to be public)
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FrivyCatMod.ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FrivyCatMod.ID);

    // Mumbo stuff
    public static final RegistryObject<Block> MUMBO_DUST_WIRE = Utils.regBlock(BLOCKS, "mumbo_dust_wire", new MumboDustWire(AbstractBlock.Properties.from(net.minecraft.block.Blocks.REDSTONE_WIRE)));
    public static final RegistryObject<Block> MUMBO_BLOCK = Utils.regBlockWithItem(BLOCKS, ITEMS, "mumbo_block", new MumboBlock(AbstractBlock.Properties.from(net.minecraft.block.Blocks.REDSTONE_BLOCK)), ItemGroup.REDSTONE);
    public static final RegistryObject<Block> SPIRIT_REALM_PORTAL = Utils.regBlock(BLOCKS, "spirit_realm_portal", new SpiritRealmPortal(AbstractBlock.Properties.from(Blocks.NETHER_PORTAL)));
    public static final RegistryObject<Block> CORRUPTED_BLOCK = Utils.regBlockWithItem(BLOCKS, ITEMS, "corrupted_block", new CorruptedBlock(AbstractBlock.Properties.create(Material.TNT).harvestLevel(0).hardnessAndResistance(0f, 10000f).sound(SoundType.SLIME).doesNotBlockMovement()), ItemGroup.DECORATIONS);

    public static void init(IEventBus eventbus) {
        FrivyCatMod.LOGGER.info("Setting up dummy blocks");
        // register the registries
        BLOCKS.register(eventbus);
        ITEMS.register(eventbus);
    }


}
