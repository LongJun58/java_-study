package com.wjl.single_;


/*
* 演示饿汉式的单例设计模式
* */
public class SingleTon01 {
    public static void main(String[] args) {
        //获取对象
        girlFriend instance = girlFriend.instance();
        System.out.println(instance);
    }
}


class girlFriend{
    private String name;

    //2、创建static属性并创建类对象实例
    private static girlFriend gf = new girlFriend("小红");

    //1、先对构造器私有化
    private girlFriend(String name){
        this.name = name;
    }


    //3、再写static方法获取对象实例
    public static girlFriend instance(){
        return gf;
    }

    @Override
    public String toString() {
        return "girlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
