package com.brostagma.main;

import com.brostagma.scene.Menu;
import com.brostagma.scene.Playing;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {

    //Classes
    private GameScreen gameScreen;
    private Render render;
    private GameUpdate gameUpdate;
    private Menu menu;
    private Playing playing;

    //FPS - UPS - MS
    public final double FPS_SET = 120.0;
    public final double UPS_SET = 60.0;
    public final double MS_SET = 1000000000.0;

    public Game() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);

        initClasses();

        add(gameScreen);
        pack();

        setLocationRelativeTo(null);
    }

    private void initClasses() {
        render = new Render(this);
        gameUpdate = new GameUpdate(this);
        menu = new Menu(this);
        playing = new Playing(this);
        gameScreen = new GameScreen(this);
    }


    public static void main(String[] args) {
        System.out.println("Work!");

        //Game
        Game game = new Game();
        game.setVisible(true);
        game.start();
    }

    private void start() {
        //Thread
        Thread gameThread = new Thread(this) {
        };
        gameThread.start();
    }

    public boolean oneSecond(long lastTimeCheck,int limit) {
       //Check One Second
        return System.currentTimeMillis() - lastTimeCheck >= limit;
    }

    @Override
    public void run() {

        double timePerFrame = MS_SET / FPS_SET;
        double timePerUpdate = MS_SET / UPS_SET;

        long lastFrame = System.nanoTime();
        long lastUpdate = System.nanoTime();
        long lastTimeCheck = System.currentTimeMillis();

        int frames = 0;
        int updates = 0;

        long now;

        while (true) {
            try {
                now = System.nanoTime();
                //Render
                if (now - lastFrame >= timePerFrame) {
                    lastFrame = now;
                    gameScreen.repaint();
                    frames++;
                }
                //Update
                if (now - lastUpdate >= timePerUpdate) {
                    lastUpdate = now;
                    gameScreen.gameUpdate(getGraphics());
                    updates++;
                }
                //Checking FPS and UPS
                if (oneSecond(lastTimeCheck, 1000)) {
                    lastTimeCheck = System.currentTimeMillis();
                    setTitle("FPS: " + frames + " | " + "UPS: " + updates);
                    System.out.println("FPS: " + frames + " | " + "UPS: " + updates);
                    frames = 0;
                    updates = 0;
                }
            }
            catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private int screenWidth = 640;
    private int screenHeight = 640;

    //Getter and Setter
    public Render getRender() {
        return render;
    }

    public GameUpdate getUpdate() {
        return gameUpdate;
    }

    public Menu getMenu() {
        return menu;
    }

    public Playing getPlaying() {
        return playing;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }
}
