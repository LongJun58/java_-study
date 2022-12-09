import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÔÂ·Ý£º");
		int mouth = myScanner.nextInt();
		if (mouth > 0 && mouth <= 12){
			switch(mouth){
				case 3:
				case 4:
				case 5:
					System.out.println("´º¼¾");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("ÏÄ¼¾");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("Çï¼¾");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("¶¬¼¾");
					break;
				default:
					System.out.println("ÔÂ·Ý´íÎó£¡");
			}
		}else {
			System.out.println("ÊäÈë´íÎó£¬ÇëÖØÐÂÊäÈë£º)");
		}
	}
}