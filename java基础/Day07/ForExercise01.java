import java.util.Scanner;
public class ForExercise01{
	public static void main(String[] args){
		int addition,reduce ;
		//接受键盘输入
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入最小值：");
		addition = myScanner.nextInt();
		System.out.print("请输入最大值：");
		reduce = myScanner.nextInt();
		int end = reduce;
		for (;addition <= end || reduce >= 0; addition ++,reduce --){
			System.out.println(addition + "+" + reduce + "=" + (addition + reduce));
		}
	}
}