package com.wjl.tankgame;

public class Tank {
    private int x; //坦克的x坐标
    private int y;//坦克的y坐标

    private int direct;//坦克的方向
    private boolean isExist; //坦克是否存活

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        if (!(direct < 0 || direct > 3)){
            setDirect(direct);
        }
        setDirect(0);
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
