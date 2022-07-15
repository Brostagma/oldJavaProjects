package com.brostagma.input;

import com.brostagma.main.Game;
import com.brostagma.main.GameLogs;
import com.brostagma.main.GameStates;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public record MyMouseListener(Game game) implements MouseListener, MouseMotionListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            switch (GameStates.gameStates) {
                case MENU:
                    game.getMenu().mouseClicked(e.getX(), e.getY());
                    break;
                case PLAYING:
                    game.getPlaying().mouseClicked(e.getX(),e.getY());
                    switch (GameLogs.gameLogs) {
                        case APPLE:
                            game.getPlaying().getAppleLevel().mouseClicked(e.getX(), e.getY());
                            break;
                        case BANANA:
                            break;
                        default:
                            break;
                    }
                    break;
                case SETTINGS:
                    //Settings
                    break;
                default:
                    break;
            }
        }
//        System.out.println("Click " + e.getY() + e.getX());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch (GameStates.gameStates) {
            case MENU:
                game.getMenu().mousePressed(e.getX(), e.getY());
                break;
            case PLAYING:
                switch (GameLogs.gameLogs) {
                    case APPLE:
                        game.getPlaying().getAppleLevel().mousePressed(e.getX(), e.getY());
                        break;
                    case BANANA:
                        break;
                    default:
                        break;
                }
            case SETTINGS:
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (GameStates.gameStates) {
            case MENU:
                game.getMenu().mouseReleased(e.getX(), e.getY());
                break;
            case PLAYING:
                switch (GameLogs.gameLogs) {
                    case APPLE:
                        game.getPlaying().getAppleLevel().mouseReleased(e.getX(), e.getY());
                        break;
                    case BANANA:
                        break;
                    default:
                        break;
                }
            case SETTINGS:
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch (GameStates.gameStates) {
            case MENU:
                game.getMenu().mouseMoved(e.getX(), e.getY());
                break;
            case PLAYING:
                switch (GameLogs.gameLogs) {
                    case APPLE:
                        game.getPlaying().getAppleLevel().mouseMoved(e.getX(), e.getY());
                        break;
                    case BANANA:
                        break;
                    default:
                        break;
                }
            case SETTINGS:
                break;
            default:
                break;

        }
    }
}
