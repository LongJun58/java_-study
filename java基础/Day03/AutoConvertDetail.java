public class AutoConvertDetail{
	public static void main(String[] args) {
		//1、有多种类型的数据混合运算时
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10; //ok
		// float d1 = n1 + 1.1; //这种不行，1.1自动转换为double类型，double容量大，结果是double类型
		// double d1 = n1 + 1.1;//这种可以，因为结果是double，变量也是double
		float d1 = n1 + 1.1F; //这种可以，因为结果是float类型，变量也是float

		//2、当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，就会报错
		// int n1 = 1.1; //错误，1.1是double类型

		//3、（byte、short）和char之间不会相互转换
		//因为byte范围是-128-127，如果char的数值超过byte范围，就无法转换，同理short类型
		byte b1 = 1; //在把1给b1时，先考虑1是否在byte范围之内

		int n2 = 1;
		byte b2 = n2;//错误，如果是变量，先考虑数据类型，int无法小容量的类型转换

		// 4、byte，short，char，三者可以计算，在计算时首先转换为int类型
		byte b3 = 1;


		// 5、boolean不参与类型转换
		// 
		// 6、 
		// 

	}
}