import java.util.Scanner;
public class ticktSystemtic{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int mouths = myScanner.nextInt();
		System.out.println("请输入你的年龄：");
		int age = myScanner.nextInt();
		if(mouths > 0 && mouths <= 12){	
			if (mouths >=4 && mouths <= 10){
				if (age < 18){
					System.out.println("儿童票半价！");
				}else if(age < 60){
					System.out.println("成人票价60！");
				}else{
					System.out.println("老人票价20");
				}
			}else {
				if (age >= 18 && age <= 60){
					System.out.println("成人票价60！");
				}else {
					System.out.println("其他票价20！");
				}
			}
		}else{
			System.out.println("月份不合法:)");
		}
	}
}