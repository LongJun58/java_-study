import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		//���ܼ�������
		Scanner input = new Scanner(System.in);
		System.out.println("�������������䣺");
		int honnerGrader = input.nextInt();
		if(honnerGrader >= 18){
			System.out.println("���Ѿ�18�꣬��Ҫ����");
		}
	}
}