package com.brostagma.scene;

import com.brostagma.main.Game;
import com.brostagma.main.GameStates;
import com.brostagma.ui.MyButton;

import java.awt.Graphics;

public class Menu extends GameScene implements SceneMethods {

    private final Game game;
    private final MyButton[] buttons = new MyButton[3];

    public Menu(Game game) {
        super(game);
        this.game = game;
        initButtons();
    }

    private void initButtons() {
        int width = 150;
        int height = width / 3;
        int x = (game.getScreenWidth() / 2) - (width / 2);
        int y = (game.getScreenHeight() / 2) - (height / 2);
        int yOffset = 100;

        buttons[0] = new MyButton("Play", x, y - yOffset, width, height);
        buttons[1] = new MyButton("Settings", x, y, width, height);
        buttons[2] = new MyButton("Exit", x, y + yOffset, width, height);
    }

    @Override
    public void render(Graphics g) {
        drawButtons(buttons, g);
    }

    @Override
    public void gameUpdate(Graphics g) {
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (buttons[0].getBounds().contains(x, y) && buttons[0].getEnabled()) {
            GameStates.gameStates = GameStates.PLAYING;
        }
        else if (buttons[1].getBounds().contains(x, y) && buttons[1].getEnabled()) {
            GameStates.gameStates = GameStates.SETTINGS;
        }
        else if (buttons[2].getBounds().contains(x, y) && buttons[2].getEnabled()) {
            System.exit(0);
        }
    }

    @Override
    public void mouseMoved(int x, int y) {
        mouseMoved(buttons, x, y);
    }

    @Override
    public void mousePressed(int x, int y) {
        mousePressed(buttons, x, y);
    }

    @Override
    public void mouseReleased(int x, int y) {
        resetBooleans(buttons);
    }
}
