public class BubbleSort{
	public static void main(String[] args){
		//��������
		int []arr = {24,69,80,57,13};
		int temp;
		
		System.out.println("=====����ǰ�����=====");
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
		System.out.println("=====���������=====");
		for(int i = 0; i < arr.length;i ++){
			System.out.print(arr[i]+ " ");
		}
	}
}
					
				
			
			
			
			
		
		
		
		
		
		
		
		
	
