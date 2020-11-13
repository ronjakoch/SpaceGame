package com.mygdx.game;


import com.badlogic.gdx.math.Rectangle;

public abstract class SpaceObject extends Rectangle {

    public SpaceObject(int xCoordinate, int yCoordinate, int width, int height) {
        this.x = xCoordinate;
        this.y = yCoordinate;
        this.width = width;
        this.height = height;
    }

    //Defines the speed of an object
    public abstract void move();

}
