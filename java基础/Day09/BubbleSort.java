public class BubbleSort{
	public static void main(String[] args){
		//定义数组
		int []arr = {24,69,80,57,13};
		int temp;
		
		System.out.println("=====排序前的情况=====");
		for(int i = 0; i < arr.length;i ++){
			System.out.print(arr[i]+ " ");
		}
		for(int i = 0; i < arr.length;i ++){
			for(int j = 0;j < arr.length -(i + 1);j ++){
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("=====排序后的情况=====");
		for(int i = 0; i < arr.length;i ++){
			System.out.print(arr[i]+ " ");
		}
	}
}
					
				
			
			
			
			
		
		
		
		
		
		
		
		
	
