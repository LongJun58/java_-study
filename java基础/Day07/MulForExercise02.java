import java.util.Scanner;
public class MulForExercise02{
	public static void main(String[] args){
		//统计3个班的成绩，每个班有5个同学，求出每个
		//班的平均分和所有班级
		Scanner myScanner = new Scanner(System.in);
		int cls = 3;
		System.out.print("请输入班级的人数：");
		int cls_amounts = myScanner.nextInt();
		int total_qualify = 0;
		int no_qualify = 0;
		for(int i = 1;i <= cls;i ++){
			for(int j = 1; j <= cls_amounts;j ++){
				System.out.print("请输入"+i+"个班级的第"+j+"个同学的成绩：");
				double achievement = myScanner.nextDouble();
				if (achievement > 59){
					total_qualify ++;
				}else{
					no_qualify ++;
				}
			}
		}
		System.out.println("班级总合格人数：" + total_qualify + "\n不合格人数：" + no_qualify);
	}
}