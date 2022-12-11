package com.wjl.homework_.homework02;

public class Student extends Person{
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return getName() + "喜欢玩足球";
    }

    public void study(){
        System.out.println("我承诺，我会好好学习！");
    }

    @Override
    public String toString() {
        return super.toString() + "\n学号：" + getStu_id();
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}
