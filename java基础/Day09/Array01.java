public class Array01{
	public static void main(String[] args){
		//����һ������
		double totalWeight = 0;
		double [] hens = {3,5,1,3.4,2,50};
		for(for i = 0;i < 6; i ++){
			System.out.println("��" +(i + 1)+"��Ԫ���ǣ�" + hens[i]);
			totalWeight += hens[i];
		}

	}
}