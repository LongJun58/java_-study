public class BreakExercise01{
	public static void main(String[] args){
		int sums = 0;
		for(int i = 1;i <= 100;i ++){
			sums += i;
			if (sums > 20){
				System.out.println("��ǰ������" + i);
				System.out.println("��ǰ�ĺͣ�" + sums);
				break;
			}
		}

	}
}