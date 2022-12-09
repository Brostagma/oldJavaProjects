package com.brostagma.ui;

import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;

public class MyButton {
    
    private int x, y, width, height;
    private String text;
    private Rectangle bounds;
    private boolean isMouseOver, isMousePressed;

    public MyButton(String text, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;

        initBounds();
    }

    private void initBounds() {
        this.bounds = new Rectangle(x, y, width, height);
    }

    public void draw(Graphics g) {

        //Body
        drawBody(g);

        //Border
        drawBorder(g);

        //Text
        drawText(g);

    }

    private void drawBorder(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        if(isMousePressed){
            g.setColor(Color.black);
            for(int z = 1; z <= 3; z++) {
                g.drawRect(x, y, width + z, height + z);
            }
            
            // g.drawRect(x, y, width + 1, height + 1);
            // g.drawRect(x, y, width + 2, height + 2);
            // g.drawRect(x, y, width + 3, height + 3);
        }
    }

    private void drawBody(Graphics g) {
        if(isMouseOver) {
            g.setColor(Color.gray);
        }
        else{
            g.setColor(Color.white);
        }
        g.fillRect(x, y, width, height);
    }

    private void drawText(Graphics g) {
        int widthSize = g.getFontMetrics().stringWidth(text);
        int heightSize = g.getFontMetrics().getHeight();
        g.drawString(text, (x - widthSize / 2) + (width / 2) , (y + heightSize) + (height / 7));
    }

    public void resetBooleans() {
        this.isMouseOver = false;
        this.isMousePressed = false;
    }

    public void setMouseOver(boolean mouseOver) {
        this.isMouseOver = mouseOver;
    }

    public void setMousePressed(boolean mousePressed) {
        this.isMousePressed = mousePressed;
    }

    public Rectangle getBounds() {
        return bounds;
    }
    
}
