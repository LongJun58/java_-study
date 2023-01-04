package com.wjl.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //定义属性：我的坦克
    private Hero hero = null;
    //定义敌方坦克
    private EnemyTank enemyTank = null;

    private static MyPanel myPanel = null;

    private MyPanel(){
        super();
    }

    public static MyPanel getInstance(){
        if (myPanel == null)
            myPanel = new MyPanel();
        return myPanel;
    }

    @Override
    public void paint(Graphics g) {
        //创建坦克对象
        hero = new Hero(200,100,0);
        //创建敌方坦克
        enemyTank = new EnemyTank(100,300,2);
        //设置颜色
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,1000,750);
        //画坦克
        drawTank(hero.getX(),hero.getY(),hero.getDirect(),1,g);
        drawTank(enemyTank.getX(),enemyTank.getY(),hero.getDirect(),2,g);
    }

    //封装方法画坦克
    private void drawTank(int x,int y,int direct,int type,Graphics g){
        switch (type){ //修改颜色
            case 1->{ //我方坦克
                g.setColor(Color.cyan);
            }
            case 2->{//敌方坦克
                g.setColor(Color.RED);
            }
        }
        switch (direct){
            case 0->{ //向上
                g.fill3DRect(x, y, 10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.fillOval(x+ 10,  y+20,20,20);
                g.drawLine(x+20, y, x + 20, y+ 30);
                g.fill3DRect(x + 30, y, 10,60,false);
            }
            case 1->{//向右
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x + 10,y + 10,40,20,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fillOval(x+ 20,y+10,20,20);
                g.drawLine(x+ 60,y+20,x+30,y+20);
            }
            case 2->{
                g.fill3DRect(x, y, 10,60,false);
                g.fill3DRect(x + 10, y + 10,20,40,false);
                g.fillOval(x+ 10,  y+20,20,20);
                g.drawLine(x+20, y + 30, x + 20, y+ 60);
                g.fill3DRect(x + 30, y, 10,60,false);
            }
            case 3->{
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x + 10,y + 10,40,20,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fillOval(x+ 20,y+10,20,20);
                g.drawLine(x,y+20,x + 30,y+20);
            }
        }
    }
}
