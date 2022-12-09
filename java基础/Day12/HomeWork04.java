public class HomeWork04{
	public static void main(String[] args) {
		//定义类和数组
		A03 a = new A03();
		int [] arr = {1,23,24,6,4,11,32,900};
		int []newArr = a.copyArr(arr);
		System.out.println("======旧数组=======");
		for(int i = 0;i < arr.length;i ++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n======新数组=======");
		for(int i = 0;i < newArr.length;i ++){
			System.out.print(newArr[i] + "\t");
		}
	}
}

class A03{
	public int[] copyArr(int []arr){
		int []newArr = new int[arr.length];
		for(int i = 0;i < arr.length;i ++){
			newArr[i] = arr[i];
		}
		return newArr;
	}
}