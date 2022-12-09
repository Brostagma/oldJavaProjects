package com.brostagma.main;


import javax.swing.JPanel;

import com.brostagma.input.MyMouseListener;
import com.brostagma.input.KeyboardListener;

import java.awt.Dimension;
import java.awt.Graphics;

public class GameScreen extends JPanel {
    
    private Game game;
    private Dimension size;

    private static int width, height;

    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;

    public GameScreen(Game game) {
        this.game = game;
        setPanelSize();
    }

    private void setPanelSize() {
        size = new Dimension(640, 640);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
        width = getPreferredSize().width;
        height = getPreferredSize().height;
    }

    public void initInputs() {
        myMouseListener = new MyMouseListener(game);
        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);

        requestFocus();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.getRender().render(g);
    }

    public static int getGameScreenWidth() {
        return width;
    }

    public static int getGameScreenHeight() {
        return height;
    }
}
