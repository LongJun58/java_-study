public class ArrayReverse{
	public static void main(String[] args){
		int []arr1 = {11,22,33,44,55,66,77};
		//������ֵ��ת
		int temproary = 0;
		for(int i = 0 ; i < arr1.length/2;i ++){
			temproary  = arr1[i]; 
			arr1[i] = arr1[arr1.length - (i + 1)];
			arr1[arr1.length-(i + 1)] = temproary;
		}

		//ѭ������
		for(int i = 0; i < arr1.length;i ++){
			System.out.println(arr1[i]);
		}
	}
}