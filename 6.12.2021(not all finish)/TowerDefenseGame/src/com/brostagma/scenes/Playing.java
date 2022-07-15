package com.brostagma.scenes;

import java.awt.Graphics;

import com.brostagma.helper.LevelBuild;
import com.brostagma.main.Game;
import com.brostagma.managers.TileManager;

public class Playing extends GameScene implements SceneMethods {

    private int[][] level;
    private TileManager tileManager;

    public Playing(Game game) {
        super(game);

        level = LevelBuild.getLevelData();
        tileManager = new TileManager();
        initButtons();
    }

    @Override
    public void render(Graphics g) {

        for(int y = 0; y < level.length; y++) {
            for(int x = 0; x < level[y].length; x++) {
                int id = level[y][x];
                g.drawImage(tileManager.getSprite(id), x * 32, y * 32, null);
            }
        }

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
