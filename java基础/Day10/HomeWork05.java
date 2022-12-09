import java.util.Scanner;
public class HomeWork05{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个整数插入数组：");
		int insert = myScanner.nextInt();
		//已知有个升序的数组，要求插入一各元素，该数组顺序依然是升序
		int [] arr = {10,12,23,45,90};
		int [] arrNew = new int[arr.length + 1];
		int index = -1;

		//循环遍历arr数组
		for(int i = 0;i < arr.length; i ++){
			//如果插入的数小于等于数组的某个元素
			if(insert <= arr[i]){
				//记录下标
				index = i;
				break;
			}	
		}
		if (index == -1){
			index = arr.length;
		}

		//开始插入数组元素
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