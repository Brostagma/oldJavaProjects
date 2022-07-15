package com.brostagma.core;

import com.brostagma.window.CoreWindow;

public abstract class CoreBase {

    public CoreBase() {
    }

    protected static void Start() {
        try {
            CoreWindow coreWindow = new CoreWindow();
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    //Loop (one second = 60 tik)
}
