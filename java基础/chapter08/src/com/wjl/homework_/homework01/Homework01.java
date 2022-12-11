package com.wjl.homework_.homework01;

public class Homework01 {
    public static void main(String[] args) {
        //创建数组
        Person person[] = new Person[3];
        person[0] = new Person("张三",45,"老师");
        person[1] = new Person("李四",23,"工人");
        person[2] = new Person("王五",59,"官员");

        Person person1 = null;
        //开始排序
        for (int i = 0;i < person.length ;i ++){
           for (int j = 0;j < person.length - 1 -i;j ++){
               if (person[j].getAge() > person[j + 1].getAge()){
                   person1 = person[j];
                   person[j] = person[j + 1];
                   person[j + 1] = person1;
               }
           }
        }
        //输出
        for (int i = 0;i < person.length;i ++){
            System.out.println(person[i]);
        }
    }
}
