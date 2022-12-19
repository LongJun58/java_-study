package com.wjl.CodeBlock_;

public class CodeBloakDetail01 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
     private int n2 = getn2();
     private static int n1 = getn1();

     static {
         System.out.println("static 代码块1被调用");
     }

     public static int getn1(){
         System.out.println("getn1() 被调用");
         return 1;
     }
    {
        System.out.println("普通代码块被调用...");
    }

    public int getn2(){
        System.out.println("普通方法被调用.....");
        return 2;
     }

    public A(){
        System.out.println("A() 构造器被调用...");
    }
}
