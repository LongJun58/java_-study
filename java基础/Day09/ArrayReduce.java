import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		//����һ������
		int []arr = {1,2,3,4,5};
		int len = arr.length;
		int []arr1;
		Scanner myScanner = new Scanner(System.in);
		do{
			//���ܼ�������
			System.out.print("�Ƿ��������(y/n):");
			char ch = myScanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y'){
				//�������������ļ���
				len --;
				if (len == 0){
					System.out.println("��ǰʣ�����һ��Ԫ�أ������ټ��٣�");
					for(int i = 0; i < arr.length; i ++){
						System.out.print(arr[i] + " ");
					}
					break;
				}
				arr1 = new int[len];
				for(int i = 0;i < len;i ++){
					arr1[i] = arr[i];
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
				//�������鸳���ɵ�����
				arr = arr1;
			}else if(ch == 'N' || ch == 'n'){
				for(int i = 0; i < arr.length; i ++){
					System.out.print(arr[i] + " ");
				}
				break;
			}else{
				System.out.println("����������������룡");
				continue;
			}
		}while(true);
	}
}