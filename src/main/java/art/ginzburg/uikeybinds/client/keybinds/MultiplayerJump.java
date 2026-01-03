package art.ginzburg.uikeybinds.client.keybinds;

import art.ginzburg.uikeybinds.client.util.ButtonHelper;
import net.minecraft.client.gui.screens.TitleScreen;

import org.lwjgl.glfw.GLFW;

import java.util.List;

public class MultiplayerJump implements Keybind {

  @Override
  public String getActionName() {
    return "Jump to Multiplayer Screen";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_M);
  }

  @Override
  public Class<?> getScreen() {
    return TitleScreen.class;
  }

  @Override
  public int getRequiredPresses() {
    return 1;
  }

  @Override
  public void handle(Integer key) {
    ButtonHelper.pressButtonOnScreen("menu.multiplayer");
  }

}
