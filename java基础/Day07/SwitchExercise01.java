import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		//ʹ��switch��Сд���͵�char��תΪ��д���������룩
		//zֻת��abcde��������ת��Ϊother
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		char word = myScanner.next().charAt(0);
		switch(word){
			case 'a':
				word = 'A';
				System.out.println(word);
				break;
			case 'b':
				word = 'B';
				System.out.println(word);
				break;
			case 'c':
				word = 'C';
				System.out.println(word);
				break;
			case 'd':
				word = 'D';
				System.out.println(word);
				break;
			case 'e':70
				word = 'E';
				System.out.println(word);
				break;
			default :
				System.out.println("other!!!");
		}
	}
}