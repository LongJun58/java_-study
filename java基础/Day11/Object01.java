public class Object01{
	public static void main(String[] args){
		//����è�����
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		System.out.println("���֣�" + cat1.name + ",���䣺" + cat1.age + ",��ɫ��" + cat1.color);
	}
}

class Cat{
	//����è�������
	String name;
	int age;
	String color;
}