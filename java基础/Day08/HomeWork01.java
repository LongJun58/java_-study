public class HomeWork01{
	public static void main(String[] args){
		//�����ֽ�
		double cash = 100000.0;
		int count  = 0;
		while(cash >= 0){
			count ++;
			if(cash > 50000){
				cash *= 0.5;
			}else{
				cash -= 1000;
			}
		}
		System.out.println("���Ծ���·��"+count+"��");
	}
}