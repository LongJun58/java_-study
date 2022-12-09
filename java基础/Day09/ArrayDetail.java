public class ArrayDetail{
	public static void main(String[] args){
		int n1 = 80;
		int n2 = n1;
		n1 = 20;
		System.out.println(n1);
		System.out.println(n2);

		//定义数组
		int arr1[] = {1,2,10};
		int arr2[] = arr1;
		arr2[0] = 100;
		for(int i = 0;i < arr1.length;i ++){
			System.out.println(arr1[i]);
		}
	}
}