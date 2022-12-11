package com.wjl.homework_.homework02;

public class Homework02 {
    public static void main(String[] args) {
        //创建一个数组
        Person[] person = new Person[4];
        person[0] = new Student("jacck",'男',15,200212);
        person[1] = new Student("mark",'女',15,200201);
        person[2] = new Teacher("jierun",'男',26,5);
        person[3] = new Teacher("mali",'女',36,10);

        Person person1 = null;
        for (int i = 0;i < person.length;i ++ ){
            for (int j = 0;j < person.length - 1 - i;j ++){
                if (person[j].getAge() < person[j + 1].getAge()){
                    person1 = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = person1;
                }
            }
        }
        //输出
        for (int i = 0;i < person.length;i ++){
            if(person[i] instanceof Student){
                Student student = (Student) person[i];
                System.out.println("学生的信息：");
                System.out.println(student);
                student.study();
            }else if (person[i] instanceof Teacher){
                Teacher teacher = (Teacher) person[i];
                System.out.println("老师的信息：");
                System.out.println(teacher);
                teacher.teach();
            }
            System.out.println(person[i].play());
        }

    }
}
