package com.wjl.ploy_.ployparameter_;

public class Manage extends Employee{
    private double bonus;

    public Manage(String name, int mouth, double salary, double bonus) {
        super(name, mouth, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理：" + getName() + "正在管理！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
