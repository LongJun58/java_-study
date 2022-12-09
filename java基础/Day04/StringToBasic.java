public class StringToBasic{
	public static void main(String[] args) {
		//基本数据类型 -》String
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		//string->基本数据类型
		String s5 = "123";
		int num = Integer.parseInt(s5);
		double num1 = Double.parseDouble(s5);
		float num2 = Float.parseFloat(s5);
		long num3 = Long.parseLong(s5);
		byte num4 = Byte.parseByte(s5);
		boolean num5 = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	
	}
}