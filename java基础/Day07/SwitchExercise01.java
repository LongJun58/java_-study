import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		//使用switch把小写类型的char型转为大写（键盘输入）
		//z只转换abcde，其他的转换为other
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符：");
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