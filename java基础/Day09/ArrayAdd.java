import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
		//��������
		int []arr = {1,2,3};
		int []arr1;
		int len = arr.length + 1;
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.print("�Ƿ������ӣ�(y/n):");
			char ch = myScanner.next().charAt(0);
			if(ch == 'N' || ch == 'n'){
				for(int i = 0;i < arr.length;i ++){
					System.out.println(arr[i]);
				}
				break;
			}else if (ch == 'Y' || ch == 'y'){
				//����һ���µ�����
				arr1 = new int[len];
				for(int i = 0;i < arr.length;i ++){
					arr1[i] = arr[i];
				}
				System.out.print("������һ�������������飺");
				int addNumber = myScanner.nextInt();
				arr1[len-1] = addNumber;
				//���µ����鸳��arr
				arr = arr1;
				//���鳤������
				len ++;
			}else{
				System.out.println("����������������룡");
				continue;
			}
			
		}while(true);
	}
}