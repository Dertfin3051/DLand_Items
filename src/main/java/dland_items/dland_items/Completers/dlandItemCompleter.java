package dland_items.dland_items.Completers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class dlandItemCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1){
            return List.of(
                "give",
                "help"
            );
        } else if (args.length == 2){
            return List.of(
              "nickname"
            );
        } else if (args.length == 3){
            return List.of(
                "SharpSword",
                "LuckyPickaxe",
                "InfinyHoe",
                "HunterSword",
                "AdminSword",
                "AdminStick",
                "DLandList"
            );
        }
        return null;
    }
}
