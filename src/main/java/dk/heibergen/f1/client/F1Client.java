package dk.heibergen.f1.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.util.InputUtil.Type;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

/* This main function holds one two important values:
zoomIndex: How much zoom. Higher value = more zoom. 1 is just your FOV.
defaultZoomIndex is the default value of zoomIndex, used at init and when resetting the zoom */

public class F1Client implements ClientModInitializer {
    public static KeyBinding keybinding;
    public static final double defaultZoomIndex = 6;
    public static double zoomIndex = defaultZoomIndex;

    // Handle Keybinding, default bind is defined per GLFW.GLFW_KEY_<your key>
    @Override public void onInitializeClient() { keybinding = new KeyBinding("key.f1.zoom", Type.KEYSYM, GLFW.GLFW_KEY_C, "category.f1.zoom"); KeyBindingHelper.registerKeyBinding(keybinding); }
}