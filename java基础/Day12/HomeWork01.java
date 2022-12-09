public class HomeWork01{
	public static void main(String[] args) {
		//定义一个类和数组
		A01 a = new A01();
		double []arr = {1.2,96.4,178.3,59.14,100,45.3};
		System.out.println("最大值是：" + a.max(arr));
	}
}
class A01{
	public double max(double [] arr){
		double maxNum = arr[0];
		for(int i = 1;i < arr.length; i ++){
			if(maxNum > arr[i]){
				maxNum = maxNum;
			}else {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
}