package com.wjl.generic_.improve_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class GenericExericse0 {
    public static void main(String[] args) {
        Employee<Mydate> emp1 = new Employee<>("张三", 16500, new Mydate(2021, 7, 9));
        Employee<Mydate> emp2 = new Employee<>("张三", 17800, new Mydate(2020, 12, 30));
        Employee<Mydate> emp3 = new Employee<>("张三", 20001, new Mydate(2022, 11, 11));
        //创建集合
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println("======排序前======");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        //定制排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 == null && o2 == null){
                    return 0;
                }
                if (o1.getName().equals(o2.getName())){
                    Mydate bit1 = (Mydate) o1.getBirthday();
                    Mydate bit2 = (Mydate) o2.getBirthday();
                    if ((bit1.getMonth() - bit2.getMonth()) == 0){
                        return bit1.getDay() - bit2.getDay();
                    }
                    return bit1.getMonth() - bit2.getMonth();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("=====排序后=====");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
