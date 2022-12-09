import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		//定义一个数组
		int []arr = {1,2,3,4,5};
		int len = arr.length;
		int []arr1;
		Scanner myScanner = new Scanner(System.in);
		do{
			//接受键盘输入
			System.out.print("是否进行缩减(y/n):");
			char ch = myScanner.next().charAt(0);
			if (ch == 'y' || ch == 'Y'){
				//进行数组容量的减少
				len --;
				if (len == 0){
					System.out.println("当前剩下最后一个元素！不能再减少！");
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
				//把新数组赋给旧的数组
				arr = arr1;
			}else if(ch == 'N' || ch == 'n'){
				for(int i = 0; i < arr.length; i ++){
					System.out.print(arr[i] + " ");
				}
				break;
			}else{
				System.out.println("输入错误！请重新输入！");
				continue;
			}
		}while(true);
	}
}