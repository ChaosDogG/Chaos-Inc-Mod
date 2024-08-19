//package chaosdog.frivycat.integrations.jei;
//
//import chaosdog.frivycat.FrivyCatMod;
//import chaosdog.frivycat.Gems;
//import mezz.jei.api.IModPlugin;
//import mezz.jei.api.JeiPlugin;
//import mezz.jei.api.constants.VanillaTypes;
//import mezz.jei.api.registration.IRecipeRegistration;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.ResourceLocation;
//
//@JeiPlugin
//public class FrivyCatJei implements IModPlugin {
//
//    private static final ResourceLocation UID = new ResourceLocation(FrivyCatMod.ID, "jei");
//
//    private void addDescription(IRecipeRegistration registration, ItemStack item) {
//        registration.addIngredientInfo(item, VanillaTypes.ITEM, item.getTranslationKey() + ".jei_info");
//    }
//
//    @Override
//    public void registerRecipes(IRecipeRegistration registration) {
//        addDescription(registration, new ItemStack(Gems.RUBY.get()));
//        addDescription(registration, new ItemStack(Gems.SAPPHIRE.get()));
//        addDescription(registration, new ItemStack(Gems.ZIRCON.get()));
//        addDescription(registration, new ItemStack(Gems.GARNET.get()));
//        addDescription(registration, new ItemStack(Gems.JADE.get()));
//        addDescription(registration, new ItemStack(Gems.JASPER.get()));
//        addDescription(registration, new ItemStack(Gems.SPINEL.get()));
//        addDescription(registration, new ItemStack(Gems.TOPAZ.get()));
//        addDescription(registration, new ItemStack(Gems.AGATE.get()));
//    }
//
//    @Override
//    public ResourceLocation getPluginUid() {
//        return UID;
//    }
//}
