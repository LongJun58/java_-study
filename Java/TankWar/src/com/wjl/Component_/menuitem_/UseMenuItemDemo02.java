package com.wjl.Component_.menuitem_;

import java.awt.*;
import java.awt.event.*;

public class UseMenuItemDemo02 {
    private Frame frame = new Frame();

    //创建文本框
    private TextArea ta = new TextArea("我爱中华",5,20);

    //创建菜单选项
    MenuItem comment = new MenuItem("注释");
    MenuItem canCelComment = new MenuItem("取消注释");
    MenuItem copy = new MenuItem("复制");
    MenuItem preserver = new MenuItem("保存");

    Menu option = new Menu("选项");
    MenuItem exit = new MenuItem("退出");
    private void into(){
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        option.add(exit);
        //创建事件处理机制
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                ta.append(actionCommand);
            }
        };

        //与事件源进行绑定
        comment.addActionListener(actionListener);
        canCelComment.addActionListener(actionListener);
        copy.addActionListener(actionListener);
        preserver.addActionListener(actionListener);

        //创建PopupMenu对象
        PopupMenu popupMenu = new PopupMenu();

        //把选择放入PopupMenu对象中
        popupMenu.add(comment);
        popupMenu.add(canCelComment);
        popupMenu.add(copy);
        popupMenu.add(preserver);
        popupMenu.add(option);

        //创建Panel容器
        Panel panel = new Panel();
        panel.add(popupMenu);
        //设置容器的大小
        panel.setPreferredSize(new Dimension(400,300));
        //为容器添加监控器
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()){
                    popupMenu.show(panel,e.getX(),e.getY()); //在鼠标点击位置显示PopupMenu
                }
            }
        });

        //加入窗口容器
        frame.add(ta);
        frame.add(panel,BorderLayout.SOUTH);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //退出窗口
            }
        });

        //设置为可见
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new UseMenuItemDemo02().into();
    }
}
