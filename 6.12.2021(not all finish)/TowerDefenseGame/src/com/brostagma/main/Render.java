package com.brostagma.main;

import java.awt.Graphics;

public class Render {
    
    private Game game;

    public Render(Game game) {
        this.game = game;
    }

    public void render(Graphics g) {

        if(GameStates.gameStates != null) {
            switch(GameStates.gameStates) {

                case MENU:
                    game.getMenu().render(g);
                    break;
                case PLAYING:
                    game.getPlaying().render(g);
                    break;
                case SETTINGS:
                    game.getSettings().render(g);
                    break;
                default:
                    game.getMenu().render(g);
                    break;
            }
        }else {
            System.out.println("Error! null");
            game.getError().render(g);
        }
    }
}
