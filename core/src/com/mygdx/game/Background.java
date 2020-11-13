package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Background extends SpaceObject{

    Texture backgroundImg1;
    Texture backgroundImg2;

    public Background(int xCoordinate, int yCoordinate, int width, int height) {
        super(xCoordinate, yCoordinate, width, height);
        backgroundImg1 = new Texture("Background.jpg");
        backgroundImg2 = new Texture("Background.jpg");
    }


    //About to add a method to move the background, but not implemented yet
    @Override
    public void move() {

    }
}
