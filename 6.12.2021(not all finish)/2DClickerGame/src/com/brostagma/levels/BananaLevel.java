package com.brostagma.levels;

import com.brostagma.main.Game;
import com.brostagma.mechanics.BananaMechanics;
import com.brostagma.scene.SceneMethods;

import java.awt.*;

public class BananaLevel extends BananaMechanics implements SceneMethods {

    public BananaLevel(Game game) {
        super(game);
    }

    @Override
    public void render(Graphics g) {
        g.fillOval(100,100,200,200);
    }

    @Override
    public void gameUpdate(Graphics g) {

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
