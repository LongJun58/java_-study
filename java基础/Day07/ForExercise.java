public class ForExercise{
	public static void main(String[] args){
		//�����ܺ͡���ʼֵ������ֵ������
		int sums = 0,j = 0,start = 1,end = 100;
		for(int i = start;i <= end;i ++){
			if(i % 9 == 0){
				j ++;
				sums+= i;
			}
		}
		System.out.println("������" + j + "," + "�ܺͣ�" + sums);
	}
}