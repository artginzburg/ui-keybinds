package cz.lukynka.uikeybinds.client.keybinds;

import java.util.List;

public interface Keybind {

  public String getActionName();

  public List<Integer> getKeybinds();

  public Class<?> getScreen();

  public int getRequiredPresses();

  public void handle(Integer key);

}
