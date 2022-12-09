public class OverLoadExercise01{
	public static void main(String[] args){
		Method md = new Method();
		System.out.println(md.max(1,4));
		System.out.println(md.max(5.0,2.3));
		System.out.println(md.max(9.0,5.6,20.6));
	}
}
class Method{
	public int max(int n1,int n2){
		return n1 > n2 ? n1 : n2; 
	}
	public double max(double n1,double n2){
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1,double n2,double n3){
		return n1 > (n2 > n3 ? n2 : n3) ? n1 : (n2 > n3 ? n2 : n3);
	}
}