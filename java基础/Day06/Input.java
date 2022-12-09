import java.util.Scanner;

public class Input{
	public static void main(String[] args) {
		//演示接受用户输入
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的名字：");
		String name = input.next();
		System.out.print("请输入您的年龄：");
		int age = input.nextInt();
		System.out.print("请输入您的薪水：");
		double sallary = input.nextDouble();
		System.out.println(name);
		System.out.println(age);
		System.out.println(sallary);
	}
}