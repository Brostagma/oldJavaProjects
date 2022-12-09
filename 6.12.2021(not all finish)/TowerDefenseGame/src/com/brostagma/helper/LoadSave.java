package com.brostagma.helper;

import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

import com.brostagma.main.GameStates;

public class LoadSave {
    
    public static BufferedImage getSpriteAtlas() {

        BufferedImage bufferedImage = null;
        InputStream inputStream = LoadSave.class.getClassLoader().getResourceAsStream(GameStates.STATIC_FILE_PATH);
        try {
            bufferedImage = ImageIO.read(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bufferedImage;
    }
}
