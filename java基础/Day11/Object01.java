public class Object01{
	public static void main(String[] args){
		//创建猫类对象
		Cat cat1 = new Cat();
		cat1.name = "小花";
		cat1.age = 3;
		cat1.color = "灰色";
		System.out.println("名字：" + cat1.name + ",年龄：" + cat1.age + ",颜色：" + cat1.color);
	}
}

class Cat{
	//定义猫类的属性
	String name;
	int age;
	String color;
}