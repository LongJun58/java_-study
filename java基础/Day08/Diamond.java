import java.util.Scanner;
public class Diamond{
	public static void main(String[] args){
		Scanner myScann[er = new Scanner(System.in);
		System.out.print("�����������");
		int aspect = myScanner.nextInt();
		for(int i = 1;i <= aspect;i ++){
			for(int k = aspect - i;k >= 1;k --){
				System.out.print(" ");
			}
			for(int j = 1;j <= 2*i-1;j ++){
				if (j == 1 || j == i * 2 -1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = aspect -1 ;i >= 1;i --){
			//ÿһ�θ��������бȽϣ�������������ڲ�����������ո�
			for (int j = aspect -1;j >= i;j -- ){
				System.out.print(" ");
			}
			for(int k = 2*i-1;k >= 1;k --){
				//������ǵ��ڵ�һ���������һ�����������
				if (k == 1 || k == i * 2 -1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}