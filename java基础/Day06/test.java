public class test{
	public static void main(String[] args){
		double sum = 0.0;
		int flag = 1;
		for(int i = 1;i <= 100;i ++){
			sum += flag*1.0/i;
			flag = flag;
		}
		System.out.println(sum);
	}
}