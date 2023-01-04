package com.wjl.Component_.Graphics_;

import com.wjl.tankgame.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawGraphicsDemo01 {

    //创建两个变量
    private final static String DRAW_RECT = "rect";
    private final static String DRAW_OVAL = "oval";

    private String item = "";
    //创建窗口对象
    Frame frame = new Frame("绘制图形");

    //创建两个按钮
    Button b1 = new Button("绘制矩形");
    Button b2 = new Button("绘制椭圆");


    //创建成员内部类
    private class MyCaves extends Canvas{

        @Override
        public void paint(Graphics g) {
            switch (item){
               case "rect" ->{
                    g.setColor(Color.RED);
                    g.fill3DRect(50,100,100,200,false);
                }
                case "oval" ->{
                   g.setColor(Color.cyan);
                   g.fillOval(100,100,80,160);
                }
            }
        }
    }

    private MyCaves myCaves = new MyCaves();

    //创建方法，开始界面
    public void into(){
        //给画布设置大小
       myCaves.setPreferredSize(new Dimension(400,500));

        //创建事件监听器
        b1.addActionListener(e -> {
            item = DRAW_RECT;
            myCaves.repaint();
        });
        b2.addActionListener(e -> {
           item = DRAW_OVAL;//修改绘制图形类型
           myCaves.repaint(); //重新刷新界面
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //退出窗口
            }
        });

        //使用FlowLayout布局管理器
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(b1);
        panel.add(b2);

        frame.add(myCaves);
        frame.add(panel,BorderLayout.SOUTH);
//        frame.add(,BorderLayout.SOUTH);

        //设置窗口可见
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new DrawGraphicsDemo01().into();
    }
}
