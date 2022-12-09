public class HomeWork04{
	public static void main(String[] args){
		int sum = 0;
		
		for(int i = 1;i <= 100;i ++){
			int substitube = 0;
			if(i % 2 == 0){
				substitube = i + 1; 
			}else{
				substitube = i - 1;
				
			}
			sum += substitube;
		}
		System.out.println("×îÖÕºÍÊÇ£º" + sum);
	}
}