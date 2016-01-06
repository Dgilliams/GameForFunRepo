package com.damosdesigns.gameforfun.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.damosdesigns.gameforfun.GameForFun;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "GameForFun";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new GameForFun(), config);
	}
}
