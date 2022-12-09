import java.util.Scanner;
public class determineCompetitionAchievement{
	public static void main(String[] args){
		//接受用户输入
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的分数：");
		double score = myScanner.nextDouble();
		if (score > 8.0){
			System.out.println("恭喜您进入决赛！");
			System.out.println("请输入你的性别:");
		char gender = myScanner.next().charAt(0);
			if (gender == '男'){
				System.out.println("进入男子决赛小组！");
			}else if(gender == '女'){
				System.out.println("进入女子决赛小组！");
			}else {
				System.out.println("性别有误！不能参加比赛！");
			}
		}else {
			System.out.println("很遗憾，你没有进入决赛！");
		}
	}
}