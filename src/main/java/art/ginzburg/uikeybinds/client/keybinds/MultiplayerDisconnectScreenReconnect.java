package art.ginzburg.uikeybinds.client.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.TransferState;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

import art.ginzburg.uikeybinds.client.util.WindowHelper;

import java.util.List;

public class MultiplayerDisconnectScreenReconnect implements Keybind {

  @Nullable
  public static ServerData lastConnectedServerData = null;

  @Override
  public String getActionName() {
    return "Reconnect to server";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_R);
  }

  @Override
  public Class<?> getScreen() {
    return DisconnectedScreen.class;
  }

  @Override
  public int getRequiredPresses() {
    return 0;
  }

  @Override
  public void handle(Integer key) {
    var screen = WindowHelper.getCurrentScreen();
    if (lastConnectedServerData != null) {
      ConnectScreen.startConnecting(screen, Minecraft.getInstance(),
          ServerAddress.parseString(lastConnectedServerData.ip), lastConnectedServerData, false, (TransferState) null);
    }
  }
}
