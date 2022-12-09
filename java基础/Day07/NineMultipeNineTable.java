public class NineMultipeNineTable{
	public static void main(String[] arge){
		for(int i = 1;i <= 9;i ++){
			for(int j = 1;j <= i; j ++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t\t");
			}
			System.out.println();
		}
	}
}