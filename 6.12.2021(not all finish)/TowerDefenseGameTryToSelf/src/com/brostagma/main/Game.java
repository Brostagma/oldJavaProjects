package com.brostagma.main;

import java.lang.Runnable;
import java.lang.Thread;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {

    //FPS and UPSs
    private final double FPS_SET = 120.0;
    private final double UPS_SET = 60.0;

    private Thread gameThread;
    

    //Classes
    private GameScreen gameScreen;

    public Game() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initClasses();

        add(gameScreen);
        pack();

        setLocationRelativeTo(null);
    }

    private void initClasses() {
        gameScreen = new GameScreen();
    }

    private void start() {
        gameThread = new Thread(this) {};
        gameThread.start();
    }

    public static void main(String[] args) {
        System.out.println("Run!!!");

        Game game = new Game();
        game.setVisible(true);
        game.start();
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000 / FPS_SET;
        double timePerUpdate = 1000000000 / UPS_SET;

        long lastFrame = System.nanoTime();
        long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();

        int frames = 0;
        int updates = 0;

        long now;

        while(true) {

            now = System.nanoTime();

            //FPS
            if(now - lastFrame >= timePerFrame) {
                repaint();
                frames++;
                lastFrame = now;
            }

            //UPS
            if(now - lastUpdate >= timePerUpdate) {
                updates++;
                lastUpdate = now;
            }

            //Checking FPS and UPS
            if(System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS : " + frames + " | " + "UPS : " + updates);
                lastTimeCheck = System.currentTimeMillis();
                frames = 0;
                updates = 0;
            }
        }
    }
    
}
