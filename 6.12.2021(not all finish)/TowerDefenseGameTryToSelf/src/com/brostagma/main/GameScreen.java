package com.brostagma.main;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;

public class GameScreen extends JPanel {
    
    private Dimension size;

    public GameScreen() {
        setPanelSize();
        
    }

    private void setPanelSize() {
        size = new Dimension(640, 640);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
