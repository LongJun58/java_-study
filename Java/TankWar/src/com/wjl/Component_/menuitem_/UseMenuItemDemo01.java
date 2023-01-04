package com.wjl.Component_.menuitem_;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.*;

public class UseMenuItemDemo01 {
    //创建窗口和菜单项组件
    private Frame frame = new Frame("测试菜单项窗口");
    private Menu fileMeun = new Menu("文件");
    private Menu editorMenu = new Menu("编辑");
    private MenuItem exit = new MenuItem("退出");
    private MenuItem autoNext = new MenuItem("自动换行");
    private MenuItem copy = new MenuItem("复制");
    private MenuItem paste = new MenuItem("粘贴");

    private Menu format = new Menu("格式");

    private MenuItem comment = new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Q,true));
    private MenuItem cancelCommment = new MenuItem("取消注释");

    //文本框
    private TextArea ta = new TextArea();

   public void into(){
        //创建事件监听机制
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(e.getActionCommand() + "\n");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //窗口退出
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        //组装菜单
        editorMenu.add(autoNext);
        editorMenu.add(copy);
        editorMenu.add(paste);
        editorMenu.add(exit);

        format.add(comment);
        format.add(cancelCommment);

        //创建菜单条
        MenuBar menuBar = new MenuBar();

        //添加菜单item
        menuBar.add(fileMeun);
        menuBar.add(editorMenu);

        //创建添加菜单
        frame.setMenuBar(menuBar);
        frame.add(ta);

        //设置可见和最佳大小
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new UseMenuItemDemo01().into();
    }
}
