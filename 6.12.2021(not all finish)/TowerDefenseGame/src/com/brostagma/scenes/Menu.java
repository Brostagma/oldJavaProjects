package com.brostagma.scenes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.ArrayList;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

import com.brostagma.main.Game;
import com.brostagma.main.GameScreen;
import com.brostagma.main.GameStates;
import com.brostagma.ui.MyButton;
import static com.brostagma.main.GameStates.*;

public class Menu extends GameScene implements SceneMethods {

    private ArrayList<BufferedImage> sprites = new ArrayList<>();
    private BufferedImage bufferedImage;

    private MyButton playingButton, settingsButton, quitButton;

    public Menu(Game game) {
        super(game);
        importImage();
        loadSprites();
        initButtons();
    }

    @Override
    public void render(Graphics g) {

        drawButtons(g);
    }

    @Override
    public void mouseClicked(int x, int y) {
        if(playingButton.getBounds().contains(x, y)) {
            SET_GAME_STATE(PLAYING);
        }
        else if(settingsButton.getBounds().contains(x, y)) {
            SET_GAME_STATE(SETTINGS);
        }
        else if(quitButton.getBounds().contains(x, y)) {
            System.exit(0);
        }
    }

    @Override
    public void mouseMoved(int x, int y) {
        playingButton.setMouseOver(false);
        settingsButton.setMouseOver(false);
        quitButton.setMouseOver(false);
        if(playingButton.getBounds().contains(x, y)) {
            playingButton.setMouseOver(true);
        }
        else if(settingsButton.getBounds().contains(x, y)) {
            settingsButton.setMouseOver(true);
        }
        else if(quitButton.getBounds().contains(x, y)) {
            quitButton.setMouseOver(true);
        }
    }

    @Override
    public void mousePressed(int x, int y) {
        //--------
        if(playingButton.getBounds().contains(x, y)) {
            playingButton.setMousePressed(true);
        }
        else if(settingsButton.getBounds().contains(x, y)) {
            settingsButton.setMousePressed(true);
        }
        else if(quitButton.getBounds().contains(x, y)) {
            quitButton.setMousePressed(true);
        }
    }

    @Override
    public void mouseReleased(int x, int y) {
        resetButtons();
    }

    private void resetButtons() {
        playingButton.resetBooleans();
        settingsButton.resetBooleans();
        quitButton.resetBooleans();
        
    }

    private void drawButtons(Graphics g) {
        playingButton.draw(g);
        settingsButton.draw(g);
        quitButton.draw(g);
    }

    private void initButtons() {

        int width = 150;
        int height = width / 3;
        int x = GameScreen.getGameScreenWidth() / 2 - width / 2;
        int y = GameScreen.getGameScreenHeight() / 2 - height / 2;
        int yOffset = 100;

        playingButton = new MyButton("Play", x, y - yOffset, width, height);
        settingsButton = new MyButton("Settings", x, y, width, height);
        quitButton = new MyButton("Quit", x, y + yOffset, width, height);
    }

    private void importImage() {

        InputStream inputStream = getClass().getResourceAsStream(GameStates.FILE_PATH);
        try {
            bufferedImage = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadSprites() {
        for(int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                sprites.add(bufferedImage.getSubimage(x * 32, y * 32, 32, 32));
            }
        }
    }

    
}
