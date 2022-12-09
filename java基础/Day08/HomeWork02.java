public class HomeWork02{
	public static void main(String[] args){
		// 输出1-100之间不能被5整除的数，每5个一行
		int count = 1;
		for(int i = 1;i <= 100; i ++){
			if(i % 5 != 0){
				count ++;
				if (count < 6){
					System.out.print(i + "\t\t");
				}else{
					count = 1;
					System.out.println(i);
				}
			}
		}
	}
}