package art.ginzburg.uikeybinds.client.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.network.chat.Component;
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
    var screen = (ConnectScreen) Minecraft.getInstance().screen;
    assert screen != null;
    for (GuiEventListener child : screen.children()) {
      if (child.getClass() == Button.class) {
        var button = (Button) child;
        if (button.getMessage().contains(Component.translatable("gui.cancel"))) {
          button.onPress();
        }
      }
    }
  }
}
