package com.brostagma.ui;

import java.awt.*;

public class MyText {

    private final int x, y;
    private String text;

    public MyText(int x, int y, String text) {
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public void draw(Graphics g) {
        drawText(g);
    }

    public void updateText(MyText myText, String text) {
        myText.text = text;
    }

    private void drawText(Graphics g) {
        g.setColor(Color.black);
        g.drawString(text, x , y);
    }
}
