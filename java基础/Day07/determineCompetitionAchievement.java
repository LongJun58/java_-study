import java.util.Scanner;
public class determineCompetitionAchievement{
	public static void main(String[] args){
		//�����û�����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ķ�����");
		double score = myScanner.nextDouble();
		if (score > 8.0){
			System.out.println("��ϲ�����������");
			System.out.println("����������Ա�:");
		char gender = myScanner.next().charAt(0);
			if (gender == '��'){
				System.out.println("�������Ӿ���С�飡");
			}else if(gender == 'Ů'){
				System.out.println("����Ů�Ӿ���С�飡");
			}else {
				System.out.println("�Ա����󣡲��ܲμӱ�����");
			}
		}else {
			System.out.println("���ź�����û�н��������");
		}
	}
}