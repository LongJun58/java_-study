public class ConstructorExercise{
	public static void main(String[] args){
		Person01 p1 = new Person01();
		System.out.println("person01�����ԣ�age=" + p1.age + ",name=" + p1.name);
		Person01 p2 = new Person01("hani",20);
		System.out.println("person02�����ԣ�age=" + p2.age + ",name=" + p2.name);

	}
}

class Person01{
	String name;
	int age;

	//�����޲ι�����
	public Person01(){
		age = 18;
	}

	//�����вι�����
	public Person01(String name,int age){
		this.name = name;
		this.age = age;
	}
}