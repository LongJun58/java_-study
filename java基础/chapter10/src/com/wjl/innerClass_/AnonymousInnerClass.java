package com.wjl.innerClass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
    }
}

interface IA{ //接口
    public void cry();
}

//创建一个test类
class Test{
    private int n1 = 100;

    public void m1(){
        //传统使用创建类对象
//        Tiger tiger = new Tiger();
//        tiger.cry();

        //使用匿名内部类创建类
        //匿名内部类的需求解决在于：解决繁杂开发的代码，简介其中的代码
        //匿名内部类的底层：在底层，jdk只创建一次对象，其中的对象名称：是外部类的类名加$1 --> Test$1，创建一次内存之后，就会销毁
        //但是如果使用匿名内部类用变量接收，则会把匿名内部类的地址赋给tiger,赋值给这个变量就会销毁这片地址
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        //查看匿名内部类的运行类型：class com.wjl.innerClass_.Test$1
        //匿名内部类通过接口创建之后，其中的运行类型就不是原来的接口的，是匿名内部类所在的外部类
        System.out.println(tiger.getClass());

        //基于类的匿名内部类
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        father.test();
        //查看匿名内部类的运行类型地址：class com.wjl.innerClass_.Test$2
        //匿名内部类通过类创建之后，其中的运行类型就不是原来的类的，是匿名内部类所在的外部类
        System.out.println(father.getClass());
    }
}

//传统实现接口的类
//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤....");
//    }
//}

//创建一个类
class Father{
    private String name;

    public Father(String name) {
        this.name = name;
    }
    public void test(){
        System.out.println("father类 test方法");
    }
}
