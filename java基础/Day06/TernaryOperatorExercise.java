public class TernaryOperatorExercise{
	public static void main(String[] args){
		//ʹ����Ԫ��������������������ֵ
		int a = 102;
		int b = 24;
		int c = 64;
		int max1;
		int max = (max1 = a > b ? a:b) > c ? max1 :c;
		System.out.println("���ֵ�ǣ�" + max);

	}

}