import java.util.Scanner;
public class DoWhileExercise04{
	public static void main(String[] args){
		int i  = 1;
		boolean bln = true;
		char judge = 'a';
		do {..l
			System.out.println("�����ޣ���");
				if (i % 5  == 0){
				Scanner myScanner = new Scanner(System.in);
				System.out.print("����˵����Ǯ��(y/n):");
			 	judge = myScanner.next().charAt(0);

			}
			if(judge == 'Y' || judge == 'y'){
			 		bln = false;
			 }else {
			 	i++;
			 }
		}while(bln);
	}
}-