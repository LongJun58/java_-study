package com.wjl.ploy_.ployparameter_;

public class Work extends Employee{
    public Work(String name, int mouth, double salary) {
        super(name, mouth, salary);
    }

    public void work(){
        System.out.println("工人：" + getName() + "正在上班");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
