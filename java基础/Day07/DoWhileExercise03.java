public class DoWhileExercise03{
	public static void main(String[] args) {
		int i = 1;
		int conut = 0; 
		do{
			if (i % 5 == 0 && i % 3 != 0){
				conut ++;
			}
			i ++;
		}while(i <= 200);
		System.out.println(conut);
	}
}