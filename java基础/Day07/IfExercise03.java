import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		// 接受用户输入
		System.out.println("请输入你的信用分：");
		Scanner input = new Scanner(System.in);
		double credictSource = input.nextDouble();
		if (credictSource > 99){
			System.out.println("信用极好！");
		}else if (credictSource > 80){
			System.out.println("信用优秀！");
		}else if (credictSource > 60){
			System.out.println("信用一般！");
		}else{
			System.out.println("信用差！");
		}
	}
}