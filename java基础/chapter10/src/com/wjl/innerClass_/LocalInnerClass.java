package com.wjl.innerClass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
//        outer01.m1();
        outer01.m3();
    }
}

class Outer01{
    private int n1 = 100;
    public void m2(){
        System.out.println("outer m2()....");
    }

    //外部类定义一个方法
    public void m1(){
        //定义一个局部内部类
        class Inner01{
            public void f1(){
                //局部内部类虽然是类，但也是属于外部类的变量，也是直接使用外部类的属性
                //局部变量只能在被定义的方法中使用，不能在外面使用，因为本质还是个局部变量
                System.out.println("n1 = " + n1);
                m2();
            }
        }

        //局部内部类可以在外部类中定义
        Inner01 inner01 = new Inner01();
        inner01.f1();
    }


    private  int a = 1;
    public void m3(){
        int b = ++a;
        System.out.println(b);
        int c = a++;
        System.out.println(c);
    }

}
