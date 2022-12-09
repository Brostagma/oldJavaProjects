package com.brostagma.game;

public class Player extends BroliSanMain  {

    private int x,y;
    private int pX, pY, pWidth, pHeight;
    private int mov;

    public Player(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void walk() {
        if(mov == 0){
            y++;
        }
        else if(mov == 1){
            y--;
        }
        else if(mov == 2){
            x++;
        }
        else if(mov == 3){
            x--;
        }
    }

    public void addSquare() {

        if(mov == 0){

            pX = x * getValue();
            pY = (y * getValue()) - getValue();
            pWidth = getValue() -2;
            pHeight = getValue() -2;
        }
        else if(mov == 1){
            pX = x * getValue();
            pY = (y * getValue()) + getValue();
            pWidth = getValue() -2;
            pHeight = getValue() -2;
        }
        else if(mov == 2){
            pX = (x * getValue()) + getValue();
            pY = (y * getValue());
            pWidth = getValue() -2;
            pHeight = getValue() -2;
        }
        else if(mov == 3){
            pX = (x * getValue()) - getValue();
            pY = (y * getValue());
            pWidth = getValue() -2;
            pHeight = getValue() -2;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getpX() {
        return pX;
    }

    public int getpY() {
        return pY;
    }

    public int getpWidth() {
        return pWidth;
    }

    public int getpHeight() {
        return pHeight;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }
}
