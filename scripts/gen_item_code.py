#!/usr/bin/env python3
names = [
    #"agate",
    #"corrupted_diamond",
    #"cultist_diamond",
    #"dark_diamond",
    #"easter_egg",
    #"fire_diamond",
    #"garnet",
    #"holy_diamond",
    #"jade",
    #"jasper",
    #"lightning_diamond",
    #"madness_diamond",
    #"mage_book",
    #"magic_wand",
    #"mic",
    #"peace_diamond",
    #"pencil",
    #"ruby",
    #"sapphire",
    #"shadow_diamond",
    #"spinel",
    #"topaz",
    #"veteran_diamond",
    #"vine_diamond",
    #"water_diamond",
    #"zircon",
    #"red_tea_bucket",
    #"redstone_with_mustash",
    #"lock_pick"
]

code = "public static final RegistryObject<Item> {name_cap} = ITEMS.register(\"{reg_name}\", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));"
for name in names:
    print(code.format(name_cap = name.upper(), reg_name = name))
