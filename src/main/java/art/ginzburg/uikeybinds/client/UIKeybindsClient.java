package art.ginzburg.uikeybinds.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class UIKeybindsClient implements ClientModInitializer {
  public static final String ID = "uikeybinds";

  @Override
  public void onInitializeClient() {
    FabricLoader.getInstance().getModContainer(ID).ifPresent(modContainer -> {
      ResourceManagerHelper.registerBuiltinResourcePack(ResourceLocation.parse("uikeybinds"), modContainer,
          Component.literal("UI Keybinds"),
          ResourcePackActivationType.DEFAULT_ENABLED);
    });
  }
}
