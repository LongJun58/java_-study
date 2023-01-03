package com.wjl.generic_.improve_;

public class Employee<E> {
    private String name;
    private double salary;
    private E birthday;

    public Employee(String name, double salary, E birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "名字\t\t" + "工资\t\t" + "出生日期\n" + this.name + "\t\t" +
                this.salary + "\t\t" + this.birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public E getBirthday() {
        return birthday;
    }

    public void setBirthday(E birthday) {
        this.birthday = birthday;
    }
}
