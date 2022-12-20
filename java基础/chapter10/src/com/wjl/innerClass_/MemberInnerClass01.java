package com.wjl.innerClass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.f1();

        //两种方式获取成员内部类
        //第一种方式
        Outer03.Inner03 inner03 = new Outer03().new Inner03();
        inner03.m1();

        //第二种方式
        Outer03.Inner03 inner = outer03.getInner();
        inner.m1();
    }
}
class Outer03{
    private String name = "张三";

    private int age = 19;

    class Inner03{
        public void m1(){
            System.out.println("name = " + name + ",age = " + age);
        }
    }

    public void f1(){
        //创建内部类对象
        Inner03 inner03 = new Inner03();
        inner03.m1();
    }

    //方法返回成员内部类
    public Inner03 getInner(){
        return new Inner03();
    }
}