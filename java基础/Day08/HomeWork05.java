public class HomeWork05{
	public static void main(String[] args){
		int sum = 1;
		for (int i = 1;i < 100; i ++){
			for(int k = 1;k <= i + 1; k ++){
				
				sum += k;
			}
			System.out.println(sum);
		}
		System.out.println("×îÖÕºÍ£º" + sum);
	}
}