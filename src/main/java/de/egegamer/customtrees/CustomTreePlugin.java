package de.egegamer.customtrees;

import org.bukkit.plugin.java.JavaPlugin;

public class CustomTreePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        createBiomeDirectories();
    }

    public void createBiomeDirectories() {
        String[] biomes = new String[] {
            "desert",
            "forest",
            "plains",
            "taiga",
            "swamp",
            "jungle",
            "flower_forest",
            "dark_forest",
            "birch_forest",
            "roofed_forest",
            "savanna",
            "badlands",
            "ice_spikes",
            "mountains",
            "mesa",
            "modified_wooded_badlands_plateau",
            "modified_jungle_edge",
            "wooded_hills",
            "large_tree_taiga"
        };

        // Logic to create directories based on biome names
        for (String biome : biomes) {
            getDataFolder().mkdirs(); // Create plugin data folder
            getDataFolder().mkdirs(biome); // Create specific biome directory
        }
    }
}
