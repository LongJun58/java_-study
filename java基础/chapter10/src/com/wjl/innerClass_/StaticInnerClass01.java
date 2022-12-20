package com.wjl.innerClass_;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        //创建内部类对象
        Outer04.Inner04 inner04 = new Outer04().gerInner();
        inner04.say();

        Outer04.Inner04 inner041 = new Outer04.Inner04();
        inner041.say();
    }
}

class Outer04{
    private int n1 = 10;
    private static String name = "张三";

    //静态内部成员
    //因为是成员变量，所以可以加修饰符public private protected
    static class Inner04{
        public void say(){
            //静态成员只能访问静态成员
            System.out.println(name);
        }
    }

    //外部类方法访问静态成员内部类的方法
    public void acquire(){
        Inner04 inner04 = new Inner04();
        inner04.say();
    }

    //返回内部类的方法
    public Inner04 gerInner(){
        return new Inner04();
    }
}
