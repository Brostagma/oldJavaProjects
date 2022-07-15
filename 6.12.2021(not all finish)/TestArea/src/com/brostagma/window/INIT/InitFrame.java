package com.brostagma.window.INIT;
import java.awt.*;

public abstract class InitFrame extends Canvas {

    protected abstract void frameGo();

    protected Dimension getDimension(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        return dimension;
    }
}
