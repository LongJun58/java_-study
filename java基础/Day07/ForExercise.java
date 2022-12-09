public class ForExercise{
	public static void main(String[] args){
		//定义总和、初始值、结束值、倍数
		int sums = 0,j = 0,start = 1,end = 100;
		for(int i = start;i <= end;i ++){
			if(i % 9 == 0){
				j ++;
				sums+= i;
			}
		}
		System.out.println("个数：" + j + "," + "总和：" + sums);
	}
}