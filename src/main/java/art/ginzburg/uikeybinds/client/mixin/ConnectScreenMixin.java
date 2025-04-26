package art.ginzburg.uikeybinds.client.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.TransferState;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import art.ginzburg.uikeybinds.client.keybinds.MultiplayerDisconnectScreenReconnect;

@Mixin(ConnectScreen.class)
public class ConnectScreenMixin {

  @Inject(at = @At("HEAD"), method = "startConnecting")
  private static void startConnecting(Screen screen, Minecraft minecraft, ServerAddress serverAddress,
      ServerData serverData, boolean bl, TransferState transferState, CallbackInfo ci) {
    MultiplayerDisconnectScreenReconnect.lastConnectedServerData = serverData;
  }
}
