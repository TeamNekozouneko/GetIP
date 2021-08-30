package ga.nekozouneko.getip.getip;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import java.net.InetAddress;


public final class GetIP extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("Started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("Stoped");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("getip")) {
            org.bukkit.entity.Player players;
            players = Bukkit.getPlayer(args[0]);
            String ip;
            ip = players.getAddress().toString();
            sender.sendMessage("§" + players.getName() + "'s IP:\n§" + ip);

        }
        return false;
    }
}