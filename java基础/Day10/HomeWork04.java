import java.util.*;
public class HomeWork04{
	public static void main(String[] args) {
		int arr[] = new int [10];
		double average = 0;
		int max = -1;
		int maxIndex = -1;
		int countEight = 0;
		for(int i = 0;i < arr.length;i ++){
			arr[i] = (int) (1 + Math.random() * (100 - 1 + 1 ));
			average += arr[i];
			if (arr[i] == 8){
				countEight ++;
				System.out.println("������"+ countEight+"��8");
				System.out.println("�У�" + arr[i] + ",�±��ǣ�" + i);
			}
		}
		//�õ�����ֵ
		average /= arr.length;
		for(int i = arr.length - 1;i >= 0;i --){
			System.out.print(arr[i] + " ");
			if(arr[i] > max){
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println("\nƽ��ֵ��" + average + "\n���ֵ��" + max + "\n���ֵ�±꣺" + maxIndex);
	}
}