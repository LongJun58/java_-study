import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args) {
		//定义数组
		int []arr = {1,2,3};
		int []arr1;
		int len = arr.length + 1;
		Scanner myScanner = new Scanner(System.in);
		do{
			System.out.print("是否进行添加？(y/n):");
			char ch = myScanner.next().charAt(0);
			if(ch == 'N' || ch == 'n'){
				for(int i = 0;i < arr.length;i ++){
					System.out.println(arr[i]);
				}
				break;
			}else if (ch == 'Y' || ch == 'y'){
				//定义一个新的数组
				arr1 = new int[len];
				for(int i = 0;i < arr.length;i ++){
					arr1[i] = arr[i];
				}
				System.out.print("请输入一个整数加入数组：");
				int addNumber = myScanner.nextInt();
				arr1[len-1] = addNumber;
				//把新的数组赋给arr
				arr = arr1;
				//数组长度增加
				len ++;
			}else{
				System.out.println("输入错误！请重新输入！");
				continue;
			}
			
		}while(true);
	}
}