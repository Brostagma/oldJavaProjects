package com.brostagma.scenes;

import java.awt.Color;
import java.awt.Graphics;

import com.brostagma.main.Game;

public class Settings extends GameScene implements SceneMethods {


    public Settings(Game game) {
        super(game);

        initButtons();
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, 640, 640);

        drawButtons(g);
    }

    @Override
    public void mouseClicked(int x, int y) {
        backButtonMouseClicked(x, y);
    }

    @Override
    public void mouseMoved(int x, int y) {
        backButtonMouseMoved(x, y);
    }

    @Override
    public void mousePressed(int x, int y) {
        backButtonMousePressed(x, y);
    }

    @Override
    public void mouseReleased(int x, int y) {
        resetButtons();
    }

    private void resetButtons() {
        resetBackButton();
    }

    private void drawButtons(Graphics g) {
        drawBackButton(g);
    }

    private void initButtons() {
        initBackButton(0, 0, 75, 75 / 3);
    }
    
}
