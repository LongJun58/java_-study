import java.util.Scanner;
public class JudgeOneNumber{
	public static void main(String[] args){
		//实现判断一个整数，属于那个范围：
		//大于0，小于0，等于0
		//接受键盘输入
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int number = myScanner.nextInt();
		if (number == 0){
			System.out.println("该数等于0");
		}else if(number > 0){
			System.out.println("该数大于0");
		}else {
			System.out.println("该数小于0");
		}
	}
}