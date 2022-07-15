package com.brostagma.scenes;

import java.awt.Graphics;

import com.brostagma.main.Game;
import com.brostagma.ui.MyButton;

import static com.brostagma.main.GameStates.SET_GAME_STATE;
import static com.brostagma.main.GameStates.MENU;

public class GameScene {

    private Game game;
    private MyButton backButton;

    public GameScene(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }


    
    //--------- BACK BUTTON ---------\\
    
    protected void backButtonMouseClicked(int x, int y) {
        if(backButton.getBounds().contains(x, y)) {
            SET_GAME_STATE(MENU);
        }
    }

    protected void backButtonMouseMoved(int x, int y) {
        backButton.setMouseOver(false);
        if(backButton.getBounds().contains(x, y)) {
            backButton.setMouseOver(true);
        }
    }

    protected void backButtonMousePressed(int x, int y) {
        if(backButton.getBounds().contains(x, y)) {
            backButton.setMousePressed(true);
        }
    }

    protected void resetBackButton() {
        backButton.resetBooleans();
    }

    protected void drawBackButton(Graphics g) {
        backButton.draw(g);
    }

    protected void initBackButton(int x, int y, int width, int height) {
        backButton = new MyButton("Menu", x, y, width, height);
    }
    
}
