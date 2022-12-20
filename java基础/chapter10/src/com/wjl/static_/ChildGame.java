package com.wjl.static_;

public class ChildGame {
    public static void main(String [] args){
        //需求：有3个小孩，用静态变量记录玩的次数
        //定义三个对象
        Child child = new Child("狐狸精");
        child.play();
        Child.count++;

        Child child1 = new Child("老鼠精");
        child1.play();
        Child.count ++;

        Child child2 = new Child("白骨精");
        child2.play();
        Child.count ++;

        System.out.println("已经有" + Child.count + "同学在玩耍");
    }
}

class Child{
    //姓名
    private String name;

    //定义记录的变量
    public static int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println(this.name + "正在玩耍！");
    }
}
