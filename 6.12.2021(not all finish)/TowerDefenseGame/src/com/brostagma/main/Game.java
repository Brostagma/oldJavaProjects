package com.brostagma.main;


import java.lang.Runnable;
import java.lang.Thread;

import javax.swing.JFrame;

import com.brostagma.scenes.Error;
import com.brostagma.scenes.Menu;
import com.brostagma.scenes.Playing;
import com.brostagma.scenes.Settings;

public class Game extends JFrame implements Runnable {

    private final double FPS_SET = 120.0;
    private final double UPS_SET = 60.0;

    //Classes
    private GameScreen gameScreen;
    
    private Render render;
    private Menu menu;
    private Playing playing;
    private Settings settings;
    private Error error;

    private Thread gameThread;

    public Game() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        initClasses();
        
        add(gameScreen);

        pack();

        setLocationRelativeTo(null);
    }

    private void initClasses() {
        render = new Render(this);
        gameScreen = new GameScreen(this);
        menu = new Menu(this);
        playing = new Playing(this);
        settings = new Settings(this);
        error = new Error(this);
    }

    private void start() {
        gameThread = new Thread(this) {};
        gameThread.start();

    }

    private void updateGame() {
        //System.out.println("Game Updated!");
    }

    public static void main(String[] args) {
        
        System.out.println("Hello !");

        Game game = new Game();
        game.setVisible(true);
        game.gameScreen.initInputs();
        // game.setSize(640, (640 + (640 - game.getContentPane().getHeight())));
        game.start();
    }

    @Override
    public void run() {

        double timePerFrame = 1000000000.0  / FPS_SET;
        double timePerUpdate = 1000000000.0  / UPS_SET;

        long lastFrame = System.nanoTime();
        long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();


        int frames = 0;
        int updates = 0;

        long now;

        while(true) {

            now = System.nanoTime();
            //Render
            if(now - lastFrame >= timePerFrame) {
                lastFrame = now;
                repaint();
                frames++;
            }

            //Update
            if(now - lastUpdate >= timePerUpdate) {
                updateGame();
                lastUpdate = now;
                updates++;
            }
            
            //Checking FPS and UPS
            if(System.currentTimeMillis() - lastTimeCheck >= 1000) {
                System.out.println("FPS: " + frames + " | " + "UPS: " + updates);
                frames = 0;
                updates = 0;
                lastTimeCheck = System.currentTimeMillis();
            }
        }
    }

    //Getters and Setters 

    public Render getRender() {
        return render;
    }

    public Menu getMenu() {
        return menu;
    }

    public Playing getPlaying() {
        return playing;
    }

    public Settings getSettings() {
        return settings;
    }

    public Error getError() {
        return error;
    }
    
}