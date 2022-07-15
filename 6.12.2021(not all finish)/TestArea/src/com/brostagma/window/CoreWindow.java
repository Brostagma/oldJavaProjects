package com.brostagma.window;

import com.brostagma.window.INIT.InitWindow;
import com.brostagma.window.frame.Frames;

public class CoreWindow extends InitWindow {

    private Frames frames;

    public CoreWindow() {
        frames = new Frames();
        windowGo();
    }
    @Override
    protected void windowGo() {
        setTitle("Core Window");
        add(frames.getCoreFrame());
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
