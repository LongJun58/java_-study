package com.wjl.Component_.BallMoveGame_;

public class Racket {
    private int x;
    private final int y;

    private int speedX = 10;
    private int speedY = 5;

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    private final int WITHE = 80;
    private final int HEIGHT = 20;

    public int getWITHE() {
        return WITHE;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public Racket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

}
