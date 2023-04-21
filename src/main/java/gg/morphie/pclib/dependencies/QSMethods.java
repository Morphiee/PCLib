package gg.morphie.pclib.dependencies;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class QSMethods {

    public ItemStack getItem(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        return new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getItem();
    }

    public String getStock(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        String stock = String.valueOf(new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getRemainingStock());
        return stock;
    }

    public String getSpace(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        String stock = String.valueOf(new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getRemainingSpace() + new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getRemainingStock());
        return stock;
    }

    public String getPrice(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        String price = "$" + (new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getPrice());
        return price;
    }

    public String getType(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        String type = new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getShopType().toString();
        return type;
    }

    public Location getLocation(UUID uuid, int index) {
        Location loc = new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).getLocation();
        return loc;
    }

    public String getShop(UUID uuid, int index) {
        Player player = Bukkit.getPlayer(uuid);
        return new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index).toString();
    }

    public org.maxgamer.quickshop.api.shop.Shop getShopByIndex(UUID uuid, int index) {
        return new Dependencies().getQuickShop().getShopManager().getPlayerAllShops(uuid).get(index);
    }

    public Material getShopSignMaterial() {
        return org.maxgamer.quickshop.util.Util.getSignMaterial();
    }
}
