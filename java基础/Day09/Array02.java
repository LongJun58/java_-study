import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		//定义数组，接受五个同学输入的成绩
		double [] scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length;i ++){
			System.out.print("请输入第"+(i+1)+"个同学的成绩：");
			scores[i] = myScanner.nextDouble();
		}

		System.out.println("========使用for遍历=========");
		for(int i = 0;i < scores.length;i ++){
			System.out.println("第"+(i + 1)+"个同学成绩：" + scores[i]);
		}
	}
}