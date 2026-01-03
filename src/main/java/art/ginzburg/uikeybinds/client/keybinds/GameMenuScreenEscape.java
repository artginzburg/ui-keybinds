package art.ginzburg.uikeybinds.client.keybinds;

import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;

import art.ginzburg.uikeybinds.client.util.ButtonHelper;
import java.util.List;

public class GameMenuScreenEscape implements Keybind {
  @Override
  public String getActionName() {
    return "Select Leave Button";
  }

  @Override
  public List<Integer> getKeybinds() {
    return List.of(GLFW.GLFW_KEY_E);
  }

  @Override
  public Class<?> getScreen() {
    return PauseScreen.class;
  }

  @Override
  public int getRequiredPresses() {
    return 1;
  }

  @Override
  public void handle(Integer key) {
    var translatable1 = Component.translatable("menu.returnToMenu");
    var translatable2 = Component.translatable("menu.disconnect");

    ButtonHelper.loopThroughButtonsOnScreen((button, screen) -> {
      var buttonMessage = button.getMessage();
      if (buttonMessage.contains(translatable1)
          || buttonMessage.contains(translatable2)) {
        screen.setFocused(button);
      }
    });
  }
}
