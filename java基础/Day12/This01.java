public class This01{
	public static void main(String[] args) {
		Dog dog = new Dog("����",12);
		dog.info();
	}
}
class Dog{
	//��������
	String name;
	//��������
	int age;

	//���幹����
	public Dog(String name,int age){
		//����ǰ�����name��ֵ
		this.name = name;
		//����ǰ�Ķ����age��ֵ
		this.age = age;
	}

	public void info(){
		System.out.println("name���ԣ�" +this.name + "\tage���ԣ�" + this.age );
	}
}