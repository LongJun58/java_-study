public class Method01{
	public static void main(String[] args){
		//����person����
		Person person = new Person();
		//���÷���
		person.speak();
		person.cal01();
		person.cal02(15);
		person.calculation(10,25);
	}
}

class Person{
	//�����Ա����
	String name;
	int age;

	//���巽��
	public void speak(){
		System.out.println("����һ�����ˣ�");
	}

	public void cal01(){
		int sum = 0;
		for(int i = 0; i <= 1000;i ++){
			sum += i;
		}
		System.out.println("sum=" + sum);
	}5

	public void cal02(int i){
		int sum = 0;
		for(int j = 1;j <= i; j ++){
			sum += j;
		}
		System.out.println("sum=" + sum);
	}

	//��дһ����������������֮��
	public double calculation(int num1,int num2){
		int res = num1 + num2;
		return res;
	}

}