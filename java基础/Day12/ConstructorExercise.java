public class ConstructorExercise{
	public static void main(String[] args){
		Person01 p1 = new Person01();
		System.out.println("person01的属性：age=" + p1.age + ",name=" + p1.name);
		Person01 p2 = new Person01("hani",20);
		System.out.println("person02的属性：age=" + p2.age + ",name=" + p2.name);

	}
}

class Person01{
	String name;
	int age;

	//定义无参构造器
	public Person01(){
		age = 18;
	}

	//定义有参构造器
	public Person01(String name,int age){
		this.name = name;
		this.age = age;
	}
}