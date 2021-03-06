package com.damosdesigns.gameforfun.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by damo on 12/31/15.
 */
public class Bird {
    private Vector2 position, velocity, acceleration;
    private float rotation;
    private int width, height;

    public Bird(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460);
    }

    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200) velocity.y = 200;

        position.add(velocity.cpy().scl(delta));

        //rotate counterclockwise
        if (velocity.y < 0) {
            rotation -= 600 * delta;
            if(rotation < -20)
                rotation = -20;
        }

        //rotate clockwise
        if (isFalling()){
            rotation += 480 * delta;
            if(rotation > 90)
                rotation = 90;
        }
    }



    public boolean isFalling(){
        return velocity.y > 110;
    }

    public boolean shouldntFlap(){
        return velocity.y > 70;
    }


    public void onClick() {
        velocity.y = -240;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }


}
