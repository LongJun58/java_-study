import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		for(int i = 3;i >= 1; i --){
			System.out.print("�����������û�����");
			String userName = myScanner.next();
			System.out.print("�������������룺");
			int passWord = myScanner.nextInt();
			if(userName.equals("wjl") && passWord == 666){
				System.out.println("��½�ɹ���");
				break;
			}else{
				System.out.println("������" + (i-1) + "��������ᣡ");
			}
		}
	}
}