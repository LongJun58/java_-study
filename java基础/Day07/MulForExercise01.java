import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		//统计3个班的成绩，每个班有5个同学，求出每个
		//班的平均分和所有班级
		Scanner myScanner = new Scanner(System.in);
		int cls = 3;
		System.out.print("请输入班级的人数：");
		int cls_amounts = myScanner.nextInt();
		double total_average = 0.0;
		for(int i = 1;i <= cls;i ++){
			double average = 0.0;
			for(int j = 1; j <= cls_amounts;j ++){
				System.out.print("请输入"+i+"个班级的第"+j+"个同学的成绩：");
				double achievement = myScanner.nextDouble();
				average += achievement;
			}
			average = average / cls_amounts;
			total_average += average;
			System.out.println("第"+i+"个班级的平均分是："+ average);
		}
		total_average = total_average / cls;
		System.out.println("所有班级的平均分：" + total_average);
	}
}