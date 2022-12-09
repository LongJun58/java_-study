package com.wjl.ploy_.ployarr_;

public class PloyArray {
    public static void main(String[] args) {
        //定义数组
        Person [] person = new Person[5];
        //创建对象
        person[0] = new Person("张三",16);
        person[1] = new Student("jack",20);
        person[2] = new Student("green",20);
        person[3] = new Teacher("罗翔",34);
        person[4] = new Teacher("王五",45);

        for(int i = 0;i < person.length;i ++){

            if(person[i] instanceof Student){
                Student student = (Student) person[i];
                student.score();
            }else if(person[i] instanceof Teacher){
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            }
            person[i].Say(); //动态绑定机制
        }
    }
}

//定义一个人类
class Person{
    private String name;
    private int age;

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

    public void Say(){
        System.out.println("人类在说话！！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
//定义一个学生对象
class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void Say() {
        System.out.println("学生在说话！");
    }

    public void score(){
        System.out.println("学生"+getName()+"没及格");
    }
}

//定义一个老师对象
class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }
    //定义一个教学方法
    public void teach(){
        System.out.println("老师"+getName()+"正在教学！");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void Say() {
        System.out.println("老师正在说话！");
    }
}