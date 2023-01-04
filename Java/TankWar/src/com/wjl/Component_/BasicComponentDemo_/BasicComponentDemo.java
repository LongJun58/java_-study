package com.wjl.Component_.BasicComponentDemo_;

import javax.swing.*;
import java.awt.*;

public class BasicComponentDemo {
    //创建组件
    Frame frame = new Frame("测试基本组件");
    TextArea textArea = new TextArea(5,20);

    Choice choice = new Choice();

    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("男",checkboxGroup,true);
    Checkbox female = new Checkbox("女",checkboxGroup,false);

    Checkbox isMarried = new Checkbox("是否已婚？");

    TextField textField = new TextField(50);

    Button button = new Button("确认");

    List colorList = new List(6,true);

    private void intoView(){
        //创建第一个Box b1容器,放入checkBoxGroup
        increaseColor(this.choice);
        Panel p1 = new Panel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        flowLayout.setHgap(10);
        p1.setLayout(flowLayout);
        p1.add(this.choice);
        p1.add(this.male);
        p1.add(this.female);
        p1.add(this.isMarried);

        //创建一个垂直Boxlayout
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(this.textArea); //放入文本框
        verticalBox.add(p1);//放入checkBox

        //创建一个水平Boxlayout
        Box horizontalBox = Box.createHorizontalBox();
        increaseColor(this.colorList);
        horizontalBox.add(verticalBox);
        horizontalBox.add(this.colorList);

        //创建第二个容器，p2放入文本框和按钮
        Panel p2 = new Panel();
        p2.add(this.textField);
        p2.add(this.button);


        this.frame.add(horizontalBox);
        this.frame.add(p2,BorderLayout.SOUTH);
//        this.frame.pack();
        this.frame.setSize(500,190);
        this.frame.setVisible(true);
    }

    private void increaseColor(Component c){
        if (c == null) {
            throw new RuntimeException("不能为空");
        }
        if (c instanceof List){
            ((List) c).add("红色");
            ((List) c).add("蓝色");
            ((List) c).add("绿色");
        }
        if (c instanceof Choice){
            ((Choice) c).add("红色");
            ((Choice) c).add("蓝色");
            ((Choice) c).add("绿色");
        }

    }
    public static void main(String[] args) {
        new BasicComponentDemo().intoView();
    }
}
