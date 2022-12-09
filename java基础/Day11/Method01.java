public class Method01{
	public static void main(String[] args){
		//创建person对象
		Person person = new Person();
		//调用方法
		person.speak();
		person.cal01();
		person.cal02(15);
		person.calculation(10,25);
	}
}

class Person{
	//定义成员变量
	String name;
	int age;

	//定义方法
	public void speak(){
		System.out.println("我是一个好人！");
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

	//编写一个方法，计算两数之和
	public double calculation(int num1,int num2){
		int res = num1 + num2;
		return res;
	}

}