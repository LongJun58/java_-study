import java.util.Scanner;
public class HomeWork03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//�������������
		int []arr = {10,12,45,90};
		do{
			System.out.print("�Ƿ����һ������(y/n?)��");
			char ch = myScanner.next().charAt(0);
			if(ch == 'Y' || ch == 'y'){
				int temp = 0;
				int [] arr1 = new int[arr.length + 1];
				System.out.print("������һ��������");
				int number = myScanner.nextInt();
				for(int i = 0; i < arr.length;i ++){
					arr1[i] = arr[i];
				}
				arr1[arr1.length - 1] = number;
				for(int i = 0; i < arr1.length; i ++){
					for(int j = 0; j < arr1.length -(i + 1);j ++){
						if(arr1[j] > arr1[j + 1]){
							temp = arr1[j];
							arr1[j] = arr1[j + 1];
							arr1[j + 1] = temp;
						}
					}
				}

				System.out.println("======��ӳɹ�======");
				for(int i = 0;i < arr1.length; i ++){
					System.out.print(arr1[i] + " ");
				}
				break;

			}else if (ch == 'n' || ch == 'N'){
				System.out.println("�˳���ӣ�");
				break;
			}else {
				System.out.println("����������������룡");
			}
		}while(true);

	}
}