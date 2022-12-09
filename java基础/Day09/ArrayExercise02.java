public class ArrayExercise02{
	public static void main(String[] args){
		//¶¨ÒåÊý×é
		int[] sets = {4,100,900,10,20};
		int max = sets[0];
		int maxIndex = 0;
		for(int i = 0;i < sets.length -1; i ++){
			if(max < sets[i + 1]){
				max = sets[i + 1];
				maxIndex = i + 1;
			}
		}
		System.out.println("×î´óÖµÊÇ£º" + max + ",ÏÂ±ê:" + maxIndex);
	}
}