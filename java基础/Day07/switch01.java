import java.util.Scanner;
public class switch01{
	public static void main(String[] args){
		//��дһ�����򣬸ó�����Խ���һ���ַ�
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		char word = myScanner.next().charAt(0);
		switch(word){
			case 'a' :
				System.out.println("����һ");
				break;
			case 'b' :
				System.out.println("���ڶ�");
				break;
			case 'c' :
				System.out.println("������");
				break;
			case 'd' :
				System.out.println("������");
				break;
			case 'e' :
				System.out.println("������");
				break;
			case 'f' :
				System.out.println("������");
				break;
			case 'g' :
				System.out.println("������");
				break;
		}
	}
}