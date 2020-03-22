package com.andrew121410.HubMusic.Radio.Events;

import com.andrew121410.HubMusic.Main;
import com.xxmicloxx.NoteBlockAPI.event.SongEndEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class OnSongEndEvent implements Listener {

    private Main plugin;

    public OnSongEndEvent(Main plugin) {
        this.plugin = plugin;

        this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
    }

    @EventHandler
    public void onSongEnd(SongEndEvent e) {
        this.plugin.getSongPlayer().start();
    }
}