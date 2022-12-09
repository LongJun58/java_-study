public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		//假如你还有59就放假，还差多少星期零几天
		// int days = 59;
		// int weeks = days / 7;
		// int day = days % 7;
		// System.out.println("星期：" + weeks + "，天：" + day);
		// 
		// 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*（华氏温度-100）
		// ，请求华氏温度对应的摄氏温度
		double fahrenheit = 234.5;
		double centigrade = 5*(fahrenheit -32)/9;
		System.out.println(centigrade);
	}
}