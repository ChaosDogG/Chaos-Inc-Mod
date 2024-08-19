#!/usr/bin/env python3
names = [
    #"agate",
    #"corrupted_diamond",
    #"cotton_candy_strand",
    #"cultist_diamond",
    #"dark_diamond",
    #"easter_egg",
    #"fire_diamond",
    #"garnet",
    #"green_apple_candy",
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

file_content = "{{\n    \"parent\": \"minecraft:item/generated\",\n    \"textures\": {{\n        \"layer0\": \"frivycat:item/{m_name}\"\n    }}\n}}"
for name in names:
    content = file_content.format(m_name = name)
    file = open(name + ".json", "w")
    file.write(content)
    file.close()
