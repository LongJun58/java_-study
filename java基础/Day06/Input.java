import java.util.Scanner;

public class Input{
	public static void main(String[] args) {
		//��ʾ�����û�����
		Scanner input = new Scanner(System.in);
		System.out.print("�������������֣�");
		String name = input.next();
		System.out.print("�������������䣺");
		int age = input.nextInt();
		System.out.print("����������нˮ��");
		double sallary = input.nextDouble();
		System.out.println(name);
		System.out.println(age);
		System.out.println(sallary);
	}
}