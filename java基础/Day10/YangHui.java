import java.util.Scanner;
public class YangHui{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������һ������ȷ�������εĸ߶ȣ�");
		int random = myScanner.nextInt();
		//�ȶ����ά����
		int[][] arr = new int[random][];
		for(int i = 0; i < arr.length;i ++){
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length;j ++){
				if(j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1;
				}else{
				//�������ÿһ�еĵ�һ���������һ��
				//���ֵ�͵�����һ��ͬ��ֵ  + ��һ�е�ǰһ��
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}