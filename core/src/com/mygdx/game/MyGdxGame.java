package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class MyGdxGame extends ApplicationAdapter {

	//Variables used in this class
	SpriteBatch batch;
	Background background;
	SpaceshipEvil spaceshipEvil;
	SpaceshipGood spaceshipGood;
	private List<AirBubble> airBubbles = new ArrayList<>();
	private List<EvilsShoot> evilsShoots = new ArrayList<>();

	//Creates start of thr game, happens once at the beginning
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Background(0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		spaceshipEvil = new SpaceshipEvil(2000, 500, 300, 300);
		spaceshipGood = new SpaceshipGood(50, 0,500,300);
	}


	//Plays the whole game, happens over and over
	@Override
	public void render () {
		batch.begin();
		checkCollision();
		batch.draw(background.backgroundImg1, background.getX(), background.getY(), background.getWidth(), background.getHeight());
		spaceshipEvil.move();
		batch.draw(spaceshipEvil.evilShip, spaceshipEvil.getX(), spaceshipEvil.getY(), spaceshipEvil.getWidth(), spaceshipEvil.getHeight());
		//Creates shots of the good ship if touched
		if(Gdx.input.isTouched()){
			airBubbles.add(spaceshipGood.shoot());
			spaceshipGood.shoot().set(spaceshipGood.getX(), spaceshipGood.getY(),100,100);
			for(int i = 0; i < airBubbles.size(); i++){
				airBubbles.get(i).move();
			}
		}
		//moves good ship if touched
		if (Gdx.input.isTouched()) {
			float sizeWidth = spaceshipGood.getWidth() / 2;
			spaceshipGood.setY(Gdx.graphics.getHeight() - Gdx.input.getY() - sizeWidth);
		}
		batch.draw(spaceshipGood.goodShip, spaceshipGood.getX(), spaceshipGood.getY(),spaceshipGood.getWidth(), spaceshipGood.getHeight());
		batch.end();
	}


	//Checks if evilship hits goodship and game's over or if evilShip gets hit by Airbubbles
	private void checkCollision(){
		if(spaceshipGood.overlaps(spaceshipEvil)){
			dispose();
		}else if(spaceshipEvil.overlaps((Rectangle) airBubbles)){
			spaceshipEvil.evilShip.dispose();
		}
	}

	//Ends the game
	@Override
	public void dispose () {
		batch.dispose();
		background.backgroundImg1.dispose();
		spaceshipGood.goodShip.dispose();
	}
}
