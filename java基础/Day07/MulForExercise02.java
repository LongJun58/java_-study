import java.util.Scanner;
public class MulForExercise02{
	public static void main(String[] args){
		//ͳ��3����ĳɼ���ÿ������5��ͬѧ�����ÿ��
		//���ƽ���ֺ����а༶
		Scanner myScanner = new Scanner(System.in);
		int cls = 3;
		System.out.print("������༶��������");
		int cls_amounts = myScanner.nextInt();
		int total_qualify = 0;
		int no_qualify = 0;
		for(int i = 1;i <= cls;i ++){
			for(int j = 1; j <= cls_amounts;j ++){
				System.out.print("������"+i+"���༶�ĵ�"+j+"��ͬѧ�ĳɼ���");
				double achievement = myScanner.nextDouble();
				if (achievement > 59){
					total_qualify ++;
				}else{
					no_qualify ++;
				}
			}
		}
		System.out.println("�༶�ܺϸ�������" + total_qualify + "\n���ϸ�������" + no_qualify);
	}
}