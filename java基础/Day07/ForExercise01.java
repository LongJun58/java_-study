import java.util.Scanner;
public class ForExercise01{
	public static void main(String[] args){
		int addition,reduce ;
		//���ܼ�������
		Scanner myScanner = new Scanner(System.in);
		System.out.print("��������Сֵ��");
		addition = myScanner.nextInt();
		System.out.print("���������ֵ��");
		reduce = myScanner.nextInt();
		int end = reduce;
		for (;addition <= end || reduce >= 0; addition ++,reduce --){
			System.out.println(addition + "+" + reduce + "=" + (addition + reduce));
		}
	}
}