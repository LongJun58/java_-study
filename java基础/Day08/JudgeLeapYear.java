import java.util.Scanner;
public class JudgeLeapYear{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int year = myScanner.nextInt();
		do {
			if(year <= 0){
				System.out.println("��ݲ���С��0��");
				System.out.print("���ٴ�����һ����ݣ�");
				year = myScanner.nextInt();
				continue;
			}else{
				if (year % 400 == 0 ||(year % 4 ==0 && year / 100 == 0)){
					System.out.println("��"+year+"��Ϊ���꣡");
				}else{
					System.out.println("��"+year+"�겻Ϊ���꣡");
				}	
			}
			break;
			
		}while(true);
	}
}