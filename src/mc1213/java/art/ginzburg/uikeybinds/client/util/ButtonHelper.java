package art.ginzburg.uikeybinds.client.util;

import net.minecraft.client.gui.components.Button;

/**
 * Version-specific helper for button press actions.
 * This version supports Minecraft 1.21.3-1.21.5 (old API without MouseButtonInfo).
 */
public class ButtonHelper {
    /**
     * Triggers a button press action.
     *
     * @param button The button to press
     */
    public static void press(Button button) {
        button.onPress();
    }
}
