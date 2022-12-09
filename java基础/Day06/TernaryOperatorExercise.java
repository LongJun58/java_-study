public class TernaryOperatorExercise{
	public static void main(String[] args){
		//使用三元运算符计算三个数的最大值
		int a = 102;
		int b = 24;
		int c = 64;
		int max1;
		int max = (max1 = a > b ? a:b) > c ? max1 :c;
		System.out.println("最大值是：" + max);

	}

}