package com.brostagma.main;

import java.awt.Graphics;

public class Render {
    //Classes
    private final Game game;

    public Render(Game game) {
        this.game = game;
    }

    public void render(Graphics g) {
        switch (GameStates.gameStates) {
            case MENU:
                game.getMenu().render(g);
                break;
            case PLAYING:
                game.getPlaying().render(g);
                break;
            case SETTINGS:
                break;
            default:
                break;
        }
    }
}
