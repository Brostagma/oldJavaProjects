package com.brostagma.levels;

import com.brostagma.main.Game;
import com.brostagma.main.GameLogs;
import com.brostagma.mechanics.AppleMechanics;
import com.brostagma.scene.SceneMethods;
import com.brostagma.ui.MyButton;
import com.brostagma.ui.MyText;

import java.awt.Graphics;

public class AppleLevel extends AppleMechanics implements SceneMethods {

    private final Game game;
    private final MyButton[] buttons = new MyButton[3];
    private MyText cookieText;

    public AppleLevel(Game game) {
        super(game);
        this.game = game;
        initButtons();
        drawText();
        lastTimeCheck = System.currentTimeMillis();
    }

    private void initButtons() {
        int width = 150;
        int height = width / 3;
        int x = (game.getScreenWidth() / 2) - (width / 2);
        int y = (game.getScreenHeight() / 2) - (height / 2);
        int yOffset = 100;

        buttons[0] = new MyButton(clickText,x,y,width,height);
        buttons[1] = new MyButton(autoText,x,y + yOffset * 2,width,height);
        buttons[1].setEnabled(false);
        buttons[2] = new MyButton(clickText,x,y + yOffset,width,height);
        buttons[2].setEnabled(false);
    }

    private void drawText() {
        int width = 150;
        int height = width / 3;
        int x = (game.getScreenWidth() / 2) - (width / 2);
        int y = (game.getScreenHeight() / 2) - (height / 2);

        cookieText = new MyText(x,y-50,"Cookie Count: " + GameLogs.cookieCount);
    }

    @Override
    public void render(Graphics g) {
        drawButtons(buttons,g);
        cookieText.draw(g);
    }

    @Override
    public void gameUpdate(Graphics g) {
        cookieText.updateText(cookieText,"Cookie Count: " + GameLogs.cookieCount);

        buttons[1].setText(autoText);
        buttons[2].setText(clickLevelText);
        buttons[1].setEnabled(checkAutoCookieValue());
        buttons[2].setEnabled(checkClickLevelValue());
        mechanicUpdate();
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (buttons[0].getBounds().contains(x, y)) {
            GameLogs.cookieCount += GameLogs.clickLevel;
        }
        else if (buttons[1].getBounds().contains(x, y) && buttons[1].getEnabled()) {
            buyAutoLevel();
        }
        else if (buttons[2].getBounds().contains(x, y) && buttons[2].getEnabled()) {
            buyClickLevel();
        }
    }

    @Override
    public void mouseMoved(int x, int y) {
        mouseMoved(buttons,x,y);
    }

    @Override
    public void mousePressed(int x, int y) {
        mousePressed(buttons,x,y);
    }

    @Override
    public void mouseReleased(int x, int y) {
        resetBooleans(buttons);
    }
}
