public class BreakExercise01{
	public static void main(String[] args){
		int sums = 0;
		for(int i = 1;i <= 100;i ++){
			sums += i;
			if (sums > 20){
				System.out.println("当前的数：" + i);
				System.out.println("当前的和：" + sums);
				break;
			}
		}

	}
}