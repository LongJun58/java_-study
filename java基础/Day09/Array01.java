public class Array01{
	public static void main(String[] args){
		//定义一个数组
		double totalWeight = 0;
		double [] hens = {3,5,1,3.4,2,50};
		for(for i = 0;i < 6; i ++){
			System.out.println("第" +(i + 1)+"个元素是：" + hens[i]);
			totalWeight += hens[i];
		}

	}
}