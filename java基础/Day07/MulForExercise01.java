import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		//ͳ��3����ĳɼ���ÿ������5��ͬѧ�����ÿ��
		//���ƽ���ֺ����а༶
		Scanner myScanner = new Scanner(System.in);
		int cls = 3;
		System.out.print("������༶��������");
		int cls_amounts = myScanner.nextInt();
		double total_average = 0.0;
		for(int i = 1;i <= cls;i ++){
			double average = 0.0;
			for(int j = 1; j <= cls_amounts;j ++){
				System.out.print("������"+i+"���༶�ĵ�"+j+"��ͬѧ�ĳɼ���");
				double achievement = myScanner.nextDouble();
				average += achievement;
			}
			average = average / cls_amounts;
			total_average += average;
			System.out.println("��"+i+"���༶��ƽ�����ǣ�"+ average);
		}
		total_average = total_average / cls;
		System.out.println("���а༶��ƽ���֣�" + total_average);
	}
}