import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		//�������飬�������ͬѧ����ĳɼ�
		double [] scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length;i ++){
			System.out.print("�������"+(i+1)+"��ͬѧ�ĳɼ���");
			scores[i] = myScanner.nextDouble();
		}

		System.out.println("========ʹ��for����=========");
		for(int i = 0;i < scores.length;i ++){
			System.out.println("��"+(i + 1)+"��ͬѧ�ɼ���" + scores[i]);
		}
	}
}