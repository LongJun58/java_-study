 package com.wjl.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TankMainView {
    public static TankMainView tankMainView = null;
    private final MyPanel myPanel;
    private final JFrame frame;
    //创建菜单条
    private final MenuBar myMenuBar = new MenuBar();
    private TankMainView() {
        frame = new JFrame("坦克大战");//主界面
        myPanel = MyPanel.getInstance();  //得到坦克游戏界面
        reloadFrame();//加载游戏界面
    }

    //单例设计，只允许一个界面对象
    public static TankMainView getTankMainView() {
        if (tankMainView == null)
            tankMainView = new TankMainView();
        return tankMainView; //返回主界面对象
    }

    //添加菜单
    private void additionMenu(Frame fr){
        //创建菜单选择框
        Menu gameOption = new Menu("游戏选择");
        MenuItem restartGame = new MenuItem("重新开始游戏");
        MenuItem exitGame = new MenuItem("退出游戏");
        MenuItem pauseGame = new MenuItem("暂停游戏");

        Menu setGame = new Menu("设置");
        Menu help = new Menu("帮助");

        //设置监听器
        exitGame.addActionListener(e->{
            System.exit(0); //退出
        });

        //组装菜单
        gameOption.add(restartGame);
        gameOption.add(exitGame);
        gameOption.add(pauseGame);

        myMenuBar.add(gameOption);
        myMenuBar.add(setGame);
        myMenuBar.add(help);

//        BoxLayout = new BoxLayout(myPanel, 20);
//        Panel p1 = new P                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       anel();
//        p1.setLayout(boxLayout);
        fr.setMenuBar(myMenuBar);
    }

    //创建一个方法，加载主界面
    private void reloadFrame(){
        //创建一个对话框
        Frame frame1 = new Frame("游戏界面");
        frame1.add(myPanel);
        additionMenu(frame1);
        frame1.setSize(1000,807);

        //创建两个按钮
        Button button1 = new Button("进入游戏");
        Button button2 = new Button("退出游戏");

        //创建事件响应机制
        button1.addActionListener(e -> frame1.setVisible(true));
        button2.addActionListener(e-> System.exit(0));
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(button1); //加入按钮
        verticalBox.add(button2);

        frame.setSize(400,200);
        frame.add(verticalBox,BorderLayout.CENTER); //放入窗口容器
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit
        frame.setVisible(true);//可见
    }
}
