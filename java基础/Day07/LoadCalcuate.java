public class LoadCalcuate{
	public static void main(String[] args){
		int a = 1>>2; //向右移2位
		int b = -1>>2;
		int c = -1<<2;  //向左移2位
		int d = -1<<2;
		int e = 3>>>2;  //向右移3位
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
	}
}