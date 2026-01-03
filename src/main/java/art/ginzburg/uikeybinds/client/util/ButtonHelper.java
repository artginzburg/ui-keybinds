package art.ginzburg.uikeybinds.client.util;

import java.util.function.BiConsumer;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

/**
 * Version-specific helper for button press actions.
 * This version supports Minecraft 1.21.9+ (new API with MouseButtonInfo).
 */
public class ButtonHelper {
  public static void pressButtonOnScreen(String translatable) {
    MutableComponent text = Component.translatable(translatable);
    loopThroughButtonsOnScreen((button, _screen) -> pressMatchingButton(button, text));
  }

  public static void loopThroughButtonsOnScreen(BiConsumer<Button, Screen> action) {
    var screen = WindowHelper.getCurrentScreen();
    screen.children().forEach(child -> {
      if (!(child instanceof Button button))
        return;

      action.accept(button, screen);
    });
  }

  private static boolean pressMatchingButton(Button buttonWidget, MutableComponent text) {
    var clickEvent = new MouseButtonInfo(GLFW.GLFW_KEY_UNKNOWN, 0);

    if (buttonWidget.getMessage().contains(text)) {
      buttonWidget.onPress(clickEvent);
      return true;
    }

    return false;
  }
}
