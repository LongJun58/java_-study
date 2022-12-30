package com.wjl.set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        System.out.println(hashSet.add("john"));
        System.out.println(hashSet.add("jack"));
        System.out.println(hashSet.add("lucy"));
        System.out.println(hashSet.add("Rose"));
        System.out.println(hashSet.add("john"));
        hashSet.remove("john");
        System.out.println("set:" + hashSet);
        //通过输出我们可以发现，相同数据时加不了HashSet的对象集合当中的
        //我们创建两个dog对象试试,看看可以不可以存放
        hashSet.add(new Dog("jack"));
        hashSet.add(new Dog("jack"));
        System.out.println("set:" + hashSet);
        //两个dog对象已经存入进去，那我们试试String类对象呢？
        hashSet.add(new String("wjl"));
        hashSet.add(new String("wjl"));
        System.out.println("set:" + hashSet);

        /**
         * 由上面我们可以知道，hashSet不可以存放同一数据
         * 但是不一同对象是可以存放的，但是不同的String对象，相同的数据却是存放不了的
         * */
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
