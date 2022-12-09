package com.wjl.ploy_.ployparameter_;

public class PloyParameter {
    //得到年工资
    public static double showEmpAnnual(Employee employee){
        return employee.getAnnual();
    }
    //测试方法
    public static void testWork(Employee employee){
        if(employee instanceof Manage){
            ((Manage)employee).manage();
        } else if (employee instanceof Work) {
            ((Work)employee).work();
        }else {
            System.out.println("类型错误！");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Manage("张三",12,23456,4432);
        Employee employee1 = new Work("李四",12,3232);
        System.out.println(showEmpAnnual(employee));
        System.out.println(showEmpAnnual(employee1));
        testWork(employee);
        testWork(employee1);
    }
}
