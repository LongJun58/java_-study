package com.wjl.object_;

public class Finalize_ {
    public static void main(String[] args) {
        //创建一个对象
        Car car = new Car("宝马");
        car = null;
        //调用gc机制
        System.gc();
        System.out.println("程序退出运行");
    }
}
class Car{
    private String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("汽车："+this.name+"被销毁了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

