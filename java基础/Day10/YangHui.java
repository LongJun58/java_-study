import java.util.Scanner;
public class YangHui{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个整数确定三角形的高度：");
		int random = myScanner.nextInt();
		//先定义二维数组
		int[][] arr = new int[random][];
		for(int i = 0; i < arr.length;i ++){
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length;j ++){
				if(j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1;
				}else{
				//如果不是每一行的第一个或者最后一个
				//这个值就等于上一行同列值  + 上一行的前一列
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}