public class HomeWork02{
	public static void main(String[] args){
		// ���1-100֮�䲻�ܱ�5����������ÿ5��һ��
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