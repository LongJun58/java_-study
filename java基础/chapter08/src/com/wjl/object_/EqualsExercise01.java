package com.wjl.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        //创建两个对象
        Person person = new Person("张三", 23, '男');
        Person person1 = new Person("王五", 23, '男');
        //判断两个对象的属性是否相等
        if(person.equals(person1)){
            System.out.println("是同一对象");
        }else{
            System.out.println("不是同一对象！");
        }
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        //重写equals方法
        //先进行判断是否为本对象
        if(obj == this){
            return true;
        }
        //判断是否为本类型
        if(obj instanceof Person){
            //向下转型
            Person person = (Person) obj;
            //返回两个对象的属性值是否相等
            return person.getName() == this.getName() && person.getAge() == this.getAge()
                    && person.getGender() == this.getGender();
        }
        return false;
    }
}
