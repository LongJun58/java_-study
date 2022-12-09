import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		//接受键盘输入
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int honnerGrader = input.nextInt();
		if(honnerGrader >= 18){
			System.out.println("你已经18岁，需要负责！");
		}
	}
}