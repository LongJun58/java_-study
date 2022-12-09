public class This01{
	public static void main(String[] args) {
		Dog dog = new Dog("来福",12);
		dog.info();
	}
}
class Dog{
	//定义名字
	String name;
	//定义年龄
	int age;

	//定义构造器
	public Dog(String name,int age){
		//给当前对象的name赋值
		this.name = name;
		//给当前的对象的age赋值
		this.age = age;
	}

	public void info(){
		System.out.println("name属性：" +this.name + "\tage属性：" + this.age );
	}
}