import java.util.Scanner;
public class JudgeOneNumber{
	public static void main(String[] args){
		//ʵ���ж�һ�������������Ǹ���Χ��
		//����0��С��0������0
		//���ܼ�������
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������һ��������");
		int number = myScanner.nextInt();
		if (number == 0){
			System.out.println("��������0");
		}else if(number > 0){
			System.out.println("��������0");
		}else {
			System.out.println("����С��0");
		}
	}
}