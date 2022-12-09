package com.brostagma.scene;

import com.brostagma.main.Game;
import com.brostagma.main.GameStates;
import com.brostagma.ui.MyButton;

import java.awt.*;

public class GameScene {
    //Classes
    private final Game game;

    public GameScene(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    protected void mouseMoved(MyButton button, int x, int y) {
        resetBooleans(button);
        if (button.getBounds().contains(x, y)) {
            button.setMouseOver(true);
        }
    }

    protected void mouseMoved(MyButton[] buttons, int x, int y) {
        resetBooleans(buttons);
        for (MyButton button : buttons) {
            if (button.getBounds().contains(x, y)) {
                button.setMouseOver(true);
            }
        }
    }

    protected void mousePressed(MyButton button, int x, int y) {
        if (button.getBounds().contains(x, y)) {
            button.setMousePressed(true);
        }
    }

    protected void mousePressed(MyButton[] button, int x, int y) {
        for (MyButton buttons : button) {
            if (buttons.getBounds().contains(x, y)) {
                buttons.setMousePressed(true);
            }
        }
    }

    protected void resetBooleans(MyButton[] buttons) {
        for (MyButton button : buttons) {
            button.resetButtons();
        }
    }

    protected void resetBooleans(MyButton button) {
        button.resetButtons();
    }

    protected void drawButtons(MyButton[] buttons, Graphics g) {
        for (MyButton button : buttons) {
            button.draw(g);
        }
    }

    protected void drawButtons(MyButton button, Graphics g) {
        button.draw(g);
    }
}
