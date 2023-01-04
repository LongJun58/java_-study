package com.wjl.Component_.BallMoveGame_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallMoveGame extends Frame{
    //只允许实例化一个对象
    private static BallMoveGame myBallMoveGame;
    //设置窗口的宽度以及高度
    private static final int WINDOW_WITHE = 500;
    private static final int WINDOW_HEIGHT = 500;

    //定义小球和球拍对象
    private final Ball myBall = new Ball(50,80);
    private final Racket myRacket = new Racket(80,400);
    //标记游戏是否结束
    private boolean is_GameEnd = false;



    //定义一个定时器
    private Timer timer;

    protected BallMoveGame() throws HeadlessException {

        this.setSize(WINDOW_WITHE,WINDOW_HEIGHT);
        myCanves.setSize(WINDOW_WITHE,WINDOW_HEIGHT);
        this.add(myCanves); //添加画布
        this.setVisible(true); //可见
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //退出
            }
        });
    }

    public static BallMoveGame getMyBallMoveGame() {
        if (myBallMoveGame == null)
            myBallMoveGame = new BallMoveGame();
        return myBallMoveGame;
    }


    //定义成员内部类
    private class MyCanves extends Canvas{
        @Override
        public void paint(Graphics g) {
            if (is_GameEnd){
                g.setColor(Color.BLUE);
                Font font = new Font("游戏结束", Font.BOLD, 60);
                g.drawString(font.getName(),200,250);
            }else{
                /*
                * 绘制小球
                * */
                g.setColor(Color.RED);
                g.fillOval(myBall.getX(), myBall.getY(),myBall.getBALL_SIZE(),myBall.getBALL_SIZE());
                /*
                * 绘制球拍
                * */
                g.setColor(Color.green);
                g.fill3DRect(myRacket.getX(), myRacket.getY(), myRacket.getWITHE(), myRacket.getHEIGHT(), false);
            }
        }
    }

    //定义画布对象
    private final MyCanves myCanves = new MyCanves();

    //定义进入主界面的方法
    private void into(){
        //TODO 在这里绘制内容

        //创建事件监听机制
        KeyListener keyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT){
                    if (myRacket.getX() > 0){
                        myRacket.setX(myRacket.getX() - myRacket.getSpeedX());
                        myCanves.repaint();
                    }
                }
                if (keyCode == KeyEvent.VK_RIGHT){ //小球向右移动
                    if (myRacket.getX() < BallMoveGame.WINDOW_WITHE){
                       myRacket.setX(myRacket.getX() + myRacket.getSpeedX());
                        myCanves.repaint();
                    }
                }
            }
        };

        //绑定监听器
        myCanves.addKeyListener(keyListener);
        getMyBallMoveGame().addKeyListener(keyListener);



        ActionListener task = e -> {
            if(myBall.getX() <= 0 || myBall.getX() > (WINDOW_WITHE - myBall.getBALL_SIZE()))
                myBall.setSpeedX(-myBall.getSpeedX());

            if(myBall.getY() <= 0 || (myBall.getY() > myRacket.getY() - myBall.getBALL_SIZE()
                    && myBall.getX() > myRacket.getX()
                    && myBall.getX() < myRacket.getX() + myRacket.getWITHE()))
                myBall.setSpeedY(-myBall.getSpeedY());
            if (myBall.getY() + myBall.getBALL_SIZE() > myRacket.getY()
                    && (myBall.getX() < myRacket.getX()
                    || myBall.getX() > myRacket.getX() + myRacket.getWITHE())){
                //游戏结束
                is_GameEnd = true;
                timer.stop();
                myCanves.repaint();
            }

            //更换小球的位置
            myBall.setX(myBall.getX() + myBall.getSpeedX());
            myBall.setY(myBall.getY() + myBall.getSpeedY());
            myCanves.repaint(); //重新绘制
        };

        //创建计时器
        timer = new Timer(100,task);
        timer.start();
    }

    public static void main(String[] args) {
        getMyBallMoveGame().into();
    }
}
