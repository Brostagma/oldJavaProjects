package com.brostagma.main;

import java.awt.Graphics;

public class GameUpdate {

    private final Game game;
    public GameUpdate(Game game) {this.game = game;}

    public void update(Graphics g) {
        switch (GameStates.gameStates) {
            case MENU:
                game.getMenu().gameUpdate(g);
                break;
            case PLAYING:
                game.getPlaying().gameUpdate(g);
                break;
            case SETTINGS:
                break;
            default:
                break;
        }
    }
}
