public class FroceConvertDetail{
	public static void main(String[] args){
		//当强制类型转换时，强制转换符只对最近的操作数有效，一般使用小括号提升优先级
		// int n1 = (int)1.2+23*12-9*4.2;
		int n1 = (int)(1.2+23*12-9*4.2);
		System.out.println(n1);
	}
}