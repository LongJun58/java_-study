public class OverLoad01{
	public static void main(String[] args) {
		MyCalculator mycalcultor = new MyCalculator();
		System.out.println(mycalcultor.calculate(1,2));
		System.out.println(mycalcultor.calculate(1,2.0));
		System.out.println(mycalcultor.calculate(2.0,1));
		System.out.println(mycalcultor.calculate(1,2,3));
	}
}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1 + n2;
	}

	public double calculate(int n1,double n2){
		return n1 + n2;
	}

	public double calculate(double n1,double n2){
		return n1 + n2;
	}
	public int calculate(int n1,int n2,int n3){
		return n1 + n2 + n3;
	}
}