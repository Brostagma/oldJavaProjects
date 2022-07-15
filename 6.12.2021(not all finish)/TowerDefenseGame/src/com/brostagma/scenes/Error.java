package com.brostagma.scenes;

import java.awt.Color;
import java.awt.Graphics;

import com.brostagma.main.Game;

public class Error extends GameScene implements SceneMethods {

    private final String GAME_STATES_ERROR = "GAME STATES IS NOT LOADING OR IS NULL!";

    public Error(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.drawString(GAME_STATES_ERROR, 100 , 320);
    }

    @Override
    public void mouseClicked(int x, int y) {
        
    }

    @Override
    public void mouseMoved(int x, int y) {
        
    }

    @Override
    public void mousePressed(int x, int y) {
        
    }

    @Override
    public void mouseReleased(int x, int y) {
        
    }
    
}
