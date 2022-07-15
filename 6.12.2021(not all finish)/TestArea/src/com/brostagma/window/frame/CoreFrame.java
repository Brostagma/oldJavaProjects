package com.brostagma.window.frame;

import com.brostagma.window.INIT.InitFrame;

import java.awt.*;

public class CoreFrame extends InitFrame {

    public CoreFrame() {
        frameGo();
    }

    protected void frameGo() {
        setPreferredSize(getDimension(480, 480));
        setBackground(Color.blue);
    }
}
