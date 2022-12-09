package com.wjl.ploy_.ployparameter_;

public class PloyParameter {
    //得到年工资
    public static double showEmpAnnual(Employee employee){
        return employee.getAnnual();
    }
    //测试方法
    public static void testWork(Employee employee){
        if(employee instanceof Manage){
            ((Manage)employee).manage();//向下转型
        } else if (employee instanceof Work) {
            ((Work)employee).work(); //向下转型
        }else {
            System.out.println("类型错误！");
        }
    }

    public static void main(String[] args) {
        //创建两个对象
        Employee employee = new Manage("张三",12,23456,4432);
        Employee employee1 = new Work("李四",12,3232);
        //计算年工资
        System.out.println(showEmpAnnual(employee));
        System.out.println(showEmpAnnual(employee1));
        //测试方法
        testWork(employee);
        testWork(employee1);
    }
}
