package com.brostagma.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class BroliSanMain extends ApplicationAdapter implements InputProcessor {

	private ShapeRenderer shapeRenderer;
	private Player player;
	private int[][] area = new int[20][20];
	private final int value = 21;
	private int fps;

	@Override
	public void create () {

		shapeRenderer = new ShapeRenderer();
		player = new Player(10,10);
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		areaDraw();
		playerDraw();
		updateGame();
		playerSquare();
		shapeRenderer.end();

	}

	@Override
	public void dispose () {

		shapeRenderer.dispose();
	}

	public void areaDraw() {
		for(int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if(area[i][j] == 0) {
					shapeRenderer.setColor(Color.BROWN);
					shapeRenderer.rect(i * value, j * value, value -2, value -2);
				}
			}
		}
	}

	public void playerDraw(){
		shapeRenderer.setColor(Color.FIREBRICK);
		shapeRenderer.rect(player.getX() * value, player.getY() * value, value -2, value -2);
	}

	public void playerSquare() {
		shapeRenderer.setColor(Color.FIREBRICK);
		shapeRenderer.rect(player.getpX(), player.getpY(), player.getpWidth(), player.getpHeight());
	}
	private void updateGame() {
		fps++;
		if(fps == 30) {
			System.out.println(fps);
			player.walk();
			player.addSquare();
			fps = 0;
		}
	}

	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Input.Keys.W){
			player.setMov(0);
		}
		else if (keycode  == Input.Keys.S){
			player.setMov(1);
		}
		else if (keycode == Input.Keys.D){
			player.setMov(2);
		}
		else if (keycode == Input.Keys.A){
			player.setMov(3);
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}

	public int getValue() {
		return value;
	}
}
