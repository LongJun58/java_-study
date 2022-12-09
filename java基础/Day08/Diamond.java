import java.util.Scanner;
public class Diamond{
	public static void main(String[] args){
		Scanner myScann[er = new Scanner(System.in);
		System.out.print("请输入层数：");
		int aspect = myScanner.nextInt();
		for(int i = 1;i <= aspect;i ++){
			for(int k = aspect - i;k >= 1;k --){
				System.out.print(" ");
			}
			for(int j = 1;j <= 2*i-1;j ++){
				if (j == 1 || j == i * 2 -1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = aspect -1 ;i >= 1;i --){
			//每一次跟层数进行比较，如果本次数大于层数，就输出空格
			for (int j = aspect -1;j >= i;j -- ){
				System.out.print(" ");
			}
			for(int k = 2*i-1;k >= 1;k --){
				//如果星星等于第一个或者最后一个就输出星星
				if (k == 1 || k == i * 2 -1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}