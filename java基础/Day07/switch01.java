import java.util.Scanner;
public class switch01{
	public static void main(String[] args){
		//编写一个程序，该程序可以接受一个字符
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符：");
		char word = myScanner.next().charAt(0);
		switch(word){
			case 'a' :
				System.out.println("星期一");
				break;
			case 'b' :
				System.out.println("星期二");
				break;
			case 'c' :
				System.out.println("星期三");
				break;
			case 'd' :
				System.out.println("星期四");
				break;
			case 'e' :
				System.out.println("星期五");
				break;
			case 'f' :
				System.out.println("星期六");
				break;
			case 'g' :
				System.out.println("星期日");
				break;
		}
	}
}