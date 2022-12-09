import java.util.Scanner;
public class Stars{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("ÇëÊäÈëĞÇĞÇµÄ²ãÊı£º");
		int totalLevel = myScanner.nextInt();
		for(int i = 1;i <= totalLevel;i ++){
			for(int k = (totalLevel -i);k >= 1;k --){
				System.out.print(" ");
			}
			for(int j = 1;j <= i * 2 -1; j++){
				// if(j > 1 || j < i * 2){
				// 	System.out.print(" ");
				// // }
				// if (j+1 > i && j + 1 < i * 2){
				// 	System.out.print(" ");
				// }
				if (j == 1 || j == i * 2 -1 || i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			// for (int k = 1 + 1; k <= i;k ++){
			// 	System.out.print("*");
			// }
			System.out.println();
		}
	}
}