import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int mouth = myScanner.nextInt();
		if (mouth > 0 && mouth <= 12){
			switch(mouth){
				case 3:
				case 4:
				case 5:
					System.out.println("����");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("�ļ�");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("�＾");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("����");
					break;
				default:
					System.out.println("�·ݴ���");
			}
		}else {
			System.out.println("����������������룺)");
		}
	}
}