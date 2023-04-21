package gg.morphie.pclib;

import gg.morphie.pclib.string.AddColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PCLib extends JavaPlugin {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&8_______________________________________________________"));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor(" &3____   ____ _     ___ _"));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&3|  _ \\ / ___| |   |_ _| |__"));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&3| |_) | |   | |    | || '_ \\ "));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&3|  __/| |___| |___ | || |_) |"));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&3|_|    \\____|_____|___|_.__/"));
        Bukkit.getConsoleSender().sendMessage(AddColor.addColor("&8_______________________________________________________"));
    }
}
