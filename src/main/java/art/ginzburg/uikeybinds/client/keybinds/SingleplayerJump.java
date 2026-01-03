package art.ginzburg.uikeybinds.client.keybinds;

import art.ginzburg.uikeybinds.client.util.ButtonHelper;
import net.minecraft.client.gui.screens.TitleScreen;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class SingleplayerJump implements Keybind {

  @Override
  public String getActionName() {
    return "Jump to Singleplayer Screen";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_S);
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
    ButtonHelper.pressButtonOnScreen("menu.singleplayer");
  }
}
