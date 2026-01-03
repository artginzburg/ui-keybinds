package art.ginzburg.uikeybinds.client.util;

import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.gui.screens.multiplayer.ServerSelectionList;

public class JoinMultiplayerScreenHelper {
  public static void joinServer(JoinMultiplayerScreen screen, ServerSelectionList.Entry entry) {
    screen.setFocused(entry);
    entry.join();
  }
}
