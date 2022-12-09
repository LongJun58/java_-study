public class MethodExercise02{
	public static void main(String[] args){
		int [][] arr = {{1,2,3},{7,8,9},{2,2,1}};
		Mytools mytools = new Mytools();
		mytools.printArrary(arr);
	}
}

class Mytools{
	public void printArrary(int [][] arr){
		for(int i = 0; i < arr.length;i ++){
			for(int j = 0; j < arr[i].length;j ++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}