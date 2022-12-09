import java.util.Scanner;
public class BreakExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		for(int i = 3;i >= 1; i --){
			System.out.print("请输入您的用户名：");
			String userName = myScanner.next();
			System.out.print("请输入您的密码：");
			int passWord = myScanner.nextInt();
			if(userName.equals("wjl") && passWord == 666){
				System.out.println("登陆成功！");
				break;
			}else{
				System.out.println("您还有" + (i-1) + "次输入机会！");
			}
		}
	}
}