package com.brostagma.input;

import com.brostagma.main.GameStates;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("Press Key A");
            GameStates.gameStates = GameStates.MENU;
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("Press Key S");
            GameStates.gameStates = GameStates.PLAYING;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
