import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		// �����û�����
		System.out.println("������������÷֣�");
		Scanner input = new Scanner(System.in);
		double credictSource = input.nextDouble();
		if (credictSource > 99){
			System.out.println("���ü��ã�");
		}else if (credictSource > 80){
			System.out.println("�������㣡");
		}else if (credictSource > 60){
			System.out.println("����һ�㣡");
		}else{
			System.out.println("���ò");
		}
	}
}