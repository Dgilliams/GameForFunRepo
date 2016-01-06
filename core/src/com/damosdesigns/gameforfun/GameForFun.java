package com.damosdesigns.gameforfun;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.damosdesigns.gameforfun.helpers.AssetLoader;
import com.damosdesigns.gameforfun.screens.GameScreen;

public class GameForFun extends Game {

    @Override
    public void create() {
        Gdx.app.log("GameForFun", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        AssetLoader.dispose();
        super.dispose();
    }


}
