import java.util.Scanner;
public class HomeWork05{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������һ�������������飺");
		int insert = myScanner.nextInt();
		//��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������
		int [] arr = {10,12,23,45,90};
		int [] arrNew = new int[arr.length + 1];
		int index = -1;

		//ѭ������arr����
		for(int i = 0;i < arr.length; i ++){
			//����������С�ڵ��������ĳ��Ԫ��
			if(insert <= arr[i]){
				//��¼�±�
				index = i;
				break;
			}	
		}
		if (index == -1){
			index = arr.length;
		}

		//��ʼ��������Ԫ��
		for(int i = 0,j = 0;i < arrNew.length;i ++){
			if(index != i){
				arrNew[i] = arr[j];
				j ++;
			}
			else{
				arrNew[i] = insert;
			}
		}
		
		arr = arrNew;
		for(int i = 0; i < arr.length;i ++){
			System.out.print(arr[i] + " ");
		}
	}
}