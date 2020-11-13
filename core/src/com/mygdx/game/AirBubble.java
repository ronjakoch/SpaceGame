package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class AirBubble extends SpaceObject{

    Texture airBubble;

    public AirBubble(int xCoordinate, int yCoordinate, int width, int height) {
        super(xCoordinate, yCoordinate, width, height);
        airBubble = new Texture("AirBubbles.png");
    }

    //Defines the speed of the airBubbles
    @Override
    public void move() {
        if(x < Gdx.graphics.getWidth() + airBubble.getWidth()){
            x += 10;
        }else {
            airBubble.dispose();
        }
    }
}
