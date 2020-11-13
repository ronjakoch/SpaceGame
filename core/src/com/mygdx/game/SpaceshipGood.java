package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

import java.awt.Rectangle;

public class SpaceshipGood extends SpaceObject {

    Texture goodShip;

    public SpaceshipGood(int xCoordinate, int yCoordinate, int width, int height) {
        super(xCoordinate, yCoordinate, width, height);
        goodShip = new Texture("GoodShip.png");
    }


    //Moves in MyGdxGame class
    @Override
    public void move(){

    }

    //Creates Airbubble for the shot
    public AirBubble shoot(){
        return new AirBubble(1,1,100,100);
    }
}
