package com.wjl.Component_.BallMoveGame_;

public class Ball {
    private int x;
    private int y;

    private int speedX = 10;
    private int speedY = 5;

    private final int BALL_SIZE = 16; //小球的大小

    public int getSpeedX() {
        return speedX;
    }
//    public int getBALL_SIZE() {
//        return this.BALL_SIZE;
//    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getBALL_SIZE() {
        return BALL_SIZE;
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

    public void setY(int y) {
        this.y = y;
    }
}
