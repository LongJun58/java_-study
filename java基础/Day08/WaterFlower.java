import java.util.Scanner;
public class WaterFlower{
	public static void main(String[] args){
		for(int i = 100;i < 1000;i ++){
			int bai = i / 100;
			int shi = i / 10 - 10 * ge;
			int ge = i % 10;
			if (i == bai*bai*bai + shi*shi*shi + ge*ge*ge){
				System.out.println("Ë®ÏÉ»¨ÊÇ£º" + i);
			}
		}
	}
}