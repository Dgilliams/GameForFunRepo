package com.damosdesigns.gameforfun.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.damosdesigns.gameforfun.gameobjects.Bird;

/**
 * Created by damo on 12/25/15.
 */
public class GameWorld {
    private Bird bird;

    public GameWorld(int midpointY) {
        bird = new Bird(33, midpointY - 5, 16, 12);
    }

    public void update(float delta) {
//        Gdx.app.log("GameWorld", "update");
        bird.update(delta);

    }
    public Bird getBird() {
        return bird;
    }

}
