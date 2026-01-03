package art.ginzburg.uikeybinds.client;

import art.ginzburg.uikeybinds.client.util.IdentifierHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;

public class UIKeybindsClient implements ClientModInitializer {
  public static final String ID = "uikeybinds";

  @Override
  public void onInitializeClient() {
    FabricLoader.getInstance().getModContainer(ID).ifPresent(modContainer -> {
      ResourceLoader.registerBuiltinPack(IdentifierHelper.parse("uikeybinds"), modContainer,
          Component.literal("UI Keybinds"),
          PackActivationType.DEFAULT_ENABLED);
    });
  }
}
