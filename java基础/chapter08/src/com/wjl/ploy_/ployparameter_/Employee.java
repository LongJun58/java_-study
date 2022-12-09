package com.wjl.ploy_.ployparameter_;

public class Employee {
    private String name;

    private int mouth;
    private double salary;

    public Employee(String name, int mouth, double salary) {
        this.name = name;
        this.mouth = mouth;
        this.salary = salary;
    }

    //得到年工资
    public double getAnnual(){
        return this.salary * this.mouth;
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
}
