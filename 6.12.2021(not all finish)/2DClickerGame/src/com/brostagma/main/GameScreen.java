package com.brostagma.main;

import com.brostagma.input.KeyboardListener;
import com.brostagma.input.MyMouseListener;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public class GameScreen extends Canvas {
    //Classes
    private final Game game;

    public GameScreen(Game game) {
        this.game = game;
        initInputs();
        setPanelSize();
    }

    private void initInputs() {
        KeyboardListener keyboardListener = new KeyboardListener();
        MyMouseListener myMouseListener = new MyMouseListener(game);
        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);

        setFocusable(true);
    }

    private void setPanelSize() {
        Dimension size = new Dimension(game.getScreenWidth(), game.getScreenHeight());
        setMinimumSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        game.getRender().render(g);
    }

    public void gameUpdate(Graphics g) {
        game.getUpdate().update(g);
    }

    public int getHeight() {
        return (int)getPreferredSize().getHeight();
    }

    public int getWidth() {
        return (int)getPreferredSize().getWidth();
    }
}
