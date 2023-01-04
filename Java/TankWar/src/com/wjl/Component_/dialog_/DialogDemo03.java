package com.wjl.Component_.dialog_;

import java.awt.*;

public class DialogDemo03 {
    public static void main(String[] args) {
        //创建窗口容器
        Frame frame = new Frame("测试窗口");

        //创建文件操作对话框模式
        FileDialog fileDialog1 = new FileDialog(frame, "选择要打开的文件", FileDialog.LOAD);
        /*
        * 注意FIleDialog.LOAD表示打开文件对话框模式
        * 而FileDialog.SAVE表示保存文件对话框模式
        * */
        FileDialog fileDialog2 = new FileDialog(frame,"选择要保存的文件路径",FileDialog.SAVE);

        //创建两个按钮
        Button button1 = new Button("打开文件");
        Button button2 = new Button("保存文件");

        //点击按钮事件响应
        button1.addActionListener(e ->{
            fileDialog1.setVisible(true);

            //获取文件的路径及文件
            String directory = fileDialog1.getDirectory();
            String file = fileDialog1.getFile();
            System.out.println("打开文件路径为：" + directory);
            System.out.println("打开文件名称：" + file);
        });

        button2.addActionListener(e ->{
            fileDialog2.setVisible(true);

            //获取文件的路径及文件名称
            String directory = fileDialog2.getDirectory();
            String file = fileDialog2.getFile();
            System.out.println("保存文件路径为：" + directory);
            System.out.println("保存文件名称为；" + file);
        });

        //加入按钮
        frame.add(button1);
        frame.add(button2,BorderLayout.SOUTH);

        //设置可见和最佳大小
        frame.pack();
        frame.setVisible(true);
    }
}
