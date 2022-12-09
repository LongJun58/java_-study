// 演示转义字符
public class ChangeChar {
	public static void main(String[] args){
		// \t:一个制表位 实现对齐的功能
		System.out.println("北京\t上海\t杭州");
		// \n:换行输出
		System.out.println("jack\nmarry\nsmith");
		// \ :转义字符
		System.out.println("C:\\Windows\\System32\\cmd.exe");
		System.out.println("老韩说：\"要好好学习java，将来有前途\"");
		// \r:回车，鼠标光标回到第一个字符
		System.out.println("老王\r王军龙");
	}
}