package org.inventivetalent.title;

import org.bukkit.plugin.java.JavaPlugin;
import org.inventivetalent.apihelper.APIManager;
import org.inventivetalent.packetlistener.PacketListenerAPI;
import org.inventivetalent.playerversion.IPlayerVersion;
import org.inventivetalent.playerversion.PlayerVersion;

public class TitlePlugin extends JavaPlugin {

	public static IPlayerVersion playerVersion;

	TitleAPI apiInstance = new TitleAPI();

	@Override
	public void onLoad() {
		APIManager.require(PacketListenerAPI.class, this);
		APIManager.require(PlayerVersion.class, this);
		APIManager.registerAPI(apiInstance, this);
	}

	@Override
	public void onEnable() {
		APIManager.initAPI(PacketListenerAPI.class);
		APIManager.initAPI(PlayerVersion.class);
		APIManager.initAPI(TitleAPI.class);
	}
}
