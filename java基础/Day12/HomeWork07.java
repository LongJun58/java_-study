public class HomeWork07{
	public static void main(String[] args) {
		Dog1 dog = new Dog1("小菜",2,"green");
		dog.show();
	}
}

class Dog1{
	//定义属性
	String name;
	int age;
	String color;
	public Dog1(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void show(){
		System.out.println("名字：" + this.name + "\t年龄:" + this.age + "\t颜色：" + this.color);
	}
}