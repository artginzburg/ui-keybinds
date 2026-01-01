package art.ginzburg.uikeybinds.client.util;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.input.MouseButtonInfo;

/**
 * Version-specific helper for button press actions.
 * This version supports Minecraft 1.21.9+ (new API with MouseButtonInfo).
 */
public class ButtonHelper {
    /**
     * Triggers a button press action.
     *
     * @param button The button to press
     */
    public static void press(Button button) {
        button.onPress(new MouseButtonInfo(0, 1));
    }
}
