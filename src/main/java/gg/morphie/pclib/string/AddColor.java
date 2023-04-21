package gg.morphie.pclib.string;

import net.md_5.bungee.api.ChatColor;

public class AddColor {

    public static String addColor(String message) {
        if (message == null) {
            return null;
        }
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
