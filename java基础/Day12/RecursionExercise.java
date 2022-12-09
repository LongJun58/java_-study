public class RecursionExercise{
	public static void main(String [] args){
		//使用递归的方式求出斐波那契数
		 Fbnq fbnq = new Fbnq();
		 int number = fbnq.fbnqNumber(20);
		 System.out.println(number);
	}
}
class Fbnq{
	public int fbnqNember(int n){
		if (n == 1 || n == 2){
			return 1;
		}else{
			return fbnqNumber(n - 1) + fbnqNember(n - 2);
		}
	}
}