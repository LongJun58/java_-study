public class HomeWork01{
	public static void main(String[] args){
		//ʵ��������
		AA aa = new AA();
		if(aa.judgeSignlyOrDouble(8)){
			System.out.println("������һ��ż����");
		}else{
			System.out.println("������һ��������");
		}

		aa.printChar(5,4);
	}
}

class AA{
	public boolean judgeSignlyOrDouble(double num){
		if(num % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	public void printChar(int x,int y){
		for(int i = 1;i <= x;i ++){
			for(int k = 1;k <= y; k ++){
				System.out.print("*" + "\t");
			}
			System.out.println();				
		}
	}
}