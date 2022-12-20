package com.wjl.innerClass_;

//匿名内部类的最佳实践
public class InnerClassExercise01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.f1();
    }
}

class Test01{
    public void f1(){
        //使用匿名内部类调用方法，使用软编码方式
        m1(new IAA() {
            @Override
            public void picture() {
                System.out.println("匿名内部类开始画画...");
            }
        });
        //传统方式：硬编码方式，如果有着不同的类对象，需要创建不同的对象和写多个方法，而匿名内部类只需要调用时就
        //可以完成方法的编写和类对象的创建
        m1(new graph());
    }
    public void m1(IAA iaa){
        iaa.picture();
    }
}
interface IAA{
    public void picture();
}

class graph implements IAA{
    @Override
    public void picture() {
        System.out.println("开始画画....");
    }
}
