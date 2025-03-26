package cz.lukynka.betteruikeybinds.client.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class MultiplayerDisconnectScreenBack implements Keybind {
    @Override
    public String getActionName() {
        return "Return to Server List";
    }

    @Override
    public List<Integer> getKeybinds() {
        return List.of(GLFW.GLFW_KEY_ESCAPE);
    }

    @Override
    public Class<?> getScreen() {
        return DisconnectedScreen.class;
    }

    @Override
    public int getRequiredPresses() {
        return 1;
    }

    @Override
    public void handle(Integer key) {
        var screen = (DisconnectedScreen) Minecraft.getInstance().screen;
        assert screen != null;
        Minecraft.getInstance().setScreen(new JoinMultiplayerScreen(new TitleScreen()));
    }
}
