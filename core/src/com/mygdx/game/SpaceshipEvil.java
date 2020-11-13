package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class SpaceshipEvil extends SpaceObject{

    Texture evilShip;

    public SpaceshipEvil(int xCoordinate, int yCoordinate, int width, int height) {
        super(xCoordinate, yCoordinate, width, height);
        evilShip = new Texture("BadShip.png");
    }


    //Defines speed of the evilShip
    @Override
    public void move(){
        if (x + evilShip.getWidth() < 0){
            evilShip.dispose();
        }else {
            x -= 3;
        }
    }
}
