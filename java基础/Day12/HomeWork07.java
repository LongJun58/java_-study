public class HomeWork07{
	public static void main(String[] args) {
		Dog1 dog = new Dog1("С��",2,"green");
		dog.show();
	}
}

class Dog1{
	//��������
	String name;
	int age;
	String color;
	public Dog1(String name,int age,String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void show(){
		System.out.println("���֣�" + this.name + "\t����:" + this.age + "\t��ɫ��" + this.color);
	}
}