public class WhileExercise01{
	public static void main(String[] args) {
		//打印1-100之间所有能被3整除的数
		int i = 1;
		while(i <= 100){
			if (i % 3 == 0){
				System.out.println(i);
			}
			i ++;
		}
	}
}