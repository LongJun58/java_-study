public class HomeWork02{
	public static void main(String[] args) {
		//定义类
		A02 a = new A02();
		String []arr = {"笑傲江湖","白发魔女传","西游记","水浒传"};
		int res = a.find(arr,"水浒传");
		if( res == -1){
			System.out.println("抱歉，没有找到！");
		}else {
			System.out.println("找到了，索引：" + res);
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