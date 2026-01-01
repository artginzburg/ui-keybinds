package art.ginzburg.uikeybinds.client.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.Minecraft;

/**
 * Version-specific helper for window/input handling.
 * This version supports Minecraft 1.21.3-1.21.8 (uses long window handle).
 */
public class WindowHelper {
  /**
   * Gets the window context for input checking.
   * This should be called once per tick and reused.
   *
   * @return Window context as Object (actually a Long)
   */
  public static Object getWindowContext() {
    return Minecraft.getInstance().getWindow().getWindow();
  }

  /**
   * Checks if a key is currently pressed using a pre-fetched window context.
   *
   * @param windowContext The window context from getWindowContext()
   * @param key           The key code to check
   * @return true if the key is pressed
   */
  public static boolean isKeyDown(Object windowContext, Integer key) {
    return InputConstants.isKeyDown((long) windowContext, key);
  }
}
