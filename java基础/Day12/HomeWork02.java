public class HomeWork02{
	public static void main(String[] args) {
		//������
		A02 a = new A02();
		String []arr = {"Ц������","�׷�ħŮ��","���μ�","ˮ䰴�"};
		int res = a.find(arr,"ˮ䰴�");
		if( res == -1){
			System.out.println("��Ǹ��û���ҵ���");
		}else {
			System.out.println("�ҵ��ˣ�������" + res);
		}
	}
}

class A02{
	public int find(String [] arr,String str){
		for(int i = 0;i < arr.length;i ++){
			if(str.equals(arr[i])){
				return i;
			}
		}

		return -1;
	}
}