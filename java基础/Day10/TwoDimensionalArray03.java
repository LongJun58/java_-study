public class TwoDimensionalArray03{
	public static void main(String[] args) {
		//定义数组
		int [][] arr = new int[3][]; //先定义二维数组
		for(int i = 0;i < arr.length;i ++){
			//开辟二维数组的元素一维数组的空间
			arr[i] = new int[i + 1]; 
			for(int j = 0; j < arr[i].length; j ++){
				arr[i][j] = i + 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
  	}
}