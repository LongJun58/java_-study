public class RecursionExercise{
	public static void main(String [] args){
		//Ê¹ÓÃµÝ¹éµÄ·½Ê½Çó³öì³²¨ÄÇÆõÊý
		 Fbnq fbnq = new Fbnq();
		 // int number = fbnq.fbnqNumber(20);
		 System.out.println(fbnq.fbnqNumber(7));
	}
}
class Fbnq{
	public int fbnqNumber(int n){
		if (n == 1 || n == 2){
			return 1;
		}else{
			return fbnqNumber(n - 1) + fbnqNumber(n - 2);
		}
	}
}