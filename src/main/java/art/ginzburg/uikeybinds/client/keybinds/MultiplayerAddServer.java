package art.ginzburg.uikeybinds.client.keybinds;

import art.ginzburg.uikeybinds.client.util.ButtonHelper;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class MultiplayerAddServer implements Keybind {
  @Override
  public String getActionName() {
    return "Add new Server";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_A);
  }

  @Override
  public Class<?> getScreen() {
    return JoinMultiplayerScreen.class;
  }

  @Override
  public int getRequiredPresses() {
    return 0;
  }

  @Override
  public void handle(Integer key) {
    ButtonHelper.pressButtonOnScreen("selectServer.add");
  }
}
