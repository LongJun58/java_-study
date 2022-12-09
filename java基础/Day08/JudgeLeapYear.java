import java.util.Scanner;
public class JudgeLeapYear{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int year = myScanner.nextInt();
		do {
			if(year <= 0){
				System.out.println("年份不能小于0！");
				System.out.print("请再次输入一个年份：");
				year = myScanner.nextInt();
				continue;
			}else{
				if (year % 400 == 0 ||(year % 4 ==0 && year / 100 == 0)){
					System.out.println("该"+year+"年为闰年！");
				}else{
					System.out.println("该"+year+"年不为闰年！");
				}	
			}
			break;
			
		}while(true);
	}
}