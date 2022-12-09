package com.brostagma.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MyButton {
    //Button Properties
    private int x, y, width, height;
    private String text;
    private Rectangle bounds;
    private boolean isMouseOver, isMousePressed, isEnabled = true;
    private static Color bodyColor = new Color(165, 165, 192, 50);
    private static Color bodyOverColor = new Color(165, 165, 130, 60);

    public MyButton(String text, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        initBounds();
    }

    private void initBounds() {
        bounds = new Rectangle(x, y, width, height);
    }

    public void draw(Graphics g) {

        //Body
        drawBody(g);
        //Border
        drawBorder(g);
        //Text
        drawText(g);
    }

    private void drawBody(Graphics g) {
        if (isEnabled) {
            mouseOver(g);
        }else {
            g.setColor(new Color(210, 210, 224));
        }
        g.fillRect(x, y, width, height);
    }

    private void mouseOver(Graphics g) {
        if ((isMouseOver)) {
            g.setColor(bodyOverColor);
        }else {
            g.setColor(bodyColor);
        }
    }

    private void drawBorder(Graphics g) {

        if (isEnabled) {
            if (isMousePressed) {
                g.setColor(Color.black);
                for (int b = 0; b <= 5; b++) {
                    g.drawRect(x,y,width + b, height + b);
                }
            }else {
                g.setColor(Color.black);
                for (int b = 0; b <= 3; b++) {
                    g.drawRect(x,y,width + b, height + b);
                }
            }
        }
    }

    private void drawText(Graphics g) {
        if (isEnabled) {
            g.setColor(Color.black);
        }else {
            g.setColor(Color.gray);
        }
        int widthSize = g.getFontMetrics().stringWidth(text);
        int heightSize = g.getFontMetrics().getHeight();

        g.drawString(text, (x - widthSize / 2) + (width / 2) , (y + heightSize / 2) + (height / 2));
    }

    public void resetButtons() {
        isMouseOver = false;
        isMousePressed = false;
    }


    //Getter and Setter
    public Rectangle getBounds() {
        return bounds;
    }

    public boolean getEnabled() {
        return isEnabled;
    }

    public void setMouseOver(boolean mouseOver) {
        isMouseOver = mouseOver;
    }

    public void setMousePressed(boolean mousePressed) {
        isMousePressed = mousePressed;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setText(String text) {
        this.text = text;
    }
}
