import java.util.Scanner;
public class ticktSystemtic{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int mouths = myScanner.nextInt();
		System.out.println("������������䣺");
		int age = myScanner.nextInt();
		if(mouths > 0 && mouths <= 12){	
			if (mouths >=4 && mouths <= 10){
				if (age < 18){
					System.out.println("��ͯƱ��ۣ�");
				}else if(age < 60){
					System.out.println("����Ʊ��60��");
				}else{
					System.out.println("����Ʊ��20");
				}
			}else {
				if (age >= 18 && age <= 60){
					System.out.println("����Ʊ��60��");
				}else {
					System.out.println("����Ʊ��20��");
				}
			}
		}else{
			System.out.println("�·ݲ��Ϸ�:)");
		}
	}
}