package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import java.util.Random;

public class EvilsShoot extends SpaceObject{

    Texture evilsShot;

    public EvilsShoot(int xCoordinate, int yCoordinate, int width, int height) {
        super(xCoordinate, yCoordinate, width, height);
        evilsShot = new Texture("EvilsShot.png");
    }


    //Defines the speed of the evilsShots
    @Override
    public void move() {

        if(x < Gdx.graphics.getWidth() + evilsShot.getWidth()){
            x += 20;
        }else {
            evilsShot.dispose();
        }

    }
}
