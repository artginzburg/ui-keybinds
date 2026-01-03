package art.ginzburg.uikeybinds.client.keybinds;

import art.ginzburg.uikeybinds.client.util.ButtonHelper;
import net.minecraft.client.gui.screens.ConnectScreen;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class CancelConnectScreen implements Keybind {
  @Override
  public String getActionName() {
    return "Cancel Connecting to Server";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_ESCAPE);
  }

  @Override
  public Class<?> getScreen() {
    return ConnectScreen.class;
  }

  @Override
  public int getRequiredPresses() {
    return 0;
  }

  @Override
  public void handle(Integer key) {
    ButtonHelper.pressButtonOnScreen("gui.cancel");
  }
}
