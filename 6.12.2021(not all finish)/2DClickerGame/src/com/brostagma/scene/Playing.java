package com.brostagma.scene;

import com.brostagma.levels.AppleLevel;
import com.brostagma.levels.BananaLevel;
import com.brostagma.main.Game;
import com.brostagma.main.GameLogs;
import com.brostagma.ui.MyButton;

import java.awt.Graphics;

public class Playing extends GameScene implements SceneMethods {

    //Classes
    private final Game game;
    MyButton myButton;
    //Levels
    private AppleLevel appleLevel;
    private BananaLevel bananaLevel;
    //Text
    private String switchLevel = "go Banana";

    public Playing(Game game) {
        super(game);
        this.game = game;
        initLevels();
        myButton = new MyButton(switchLevel,540,540,100,100);
    }

    private void initLevels() {
        appleLevel = new AppleLevel(game);
        bananaLevel = new BananaLevel(game);
    }

    @Override
    public void render(Graphics g) {
        myButton.draw(g);
        switch (GameLogs.gameLogs) {
            case APPLE:
                appleLevel.render(g);
                break;
            case BANANA:
                bananaLevel.render(g);
                break;
            default:
                break;
        }
    }

    @Override
    public void gameUpdate(Graphics g) {
        switch (GameLogs.gameLogs) {
            case APPLE:
                appleLevel.gameUpdate(g);
                break;
            case BANANA:
                bananaLevel.gameUpdate(g);
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (myButton.getBounds().contains(x,y)) {
//            System.out.println("Test Work!");
            switch (GameLogs.gameLogs) {
                case APPLE:
                    GameLogs.gameLogs = GameLogs.BANANA;
                    myButton.setText(switchLevel = "go Apple");
                    break;
                case BANANA:
                    GameLogs.gameLogs = GameLogs.APPLE;
                    myButton.setText(switchLevel = "go Banana");
                    break;
                default:
                    break;
            }
        }
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

    //Getter and Setter
    public AppleLevel getAppleLevel() {
        return appleLevel;
    }
}
