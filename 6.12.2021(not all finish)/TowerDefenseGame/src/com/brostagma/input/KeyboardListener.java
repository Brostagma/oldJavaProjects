package com.brostagma.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.brostagma.main.GameStates;

public class KeyboardListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println("Press Key A");
            GameStates.gameStates = GameStates.MENU;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println("Press Key S");
            GameStates.gameStates = GameStates.PLAYING;
        }
        else if(e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println("Press Key D");
            GameStates.gameStates = GameStates.SETTINGS;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}