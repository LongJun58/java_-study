public class VarilibleParameters{
	public static void main(String[] args) {
		WjlMethod wjl = new WjlMethod();
		System.out.println(wjl.amount(1,11,3,21));
	}
}
class WjlMethod{
	//ʹ�ÿɱ�������ܶ������
	public int amount(int...nums){
		int res = 0;
		for(int i = 0; i < nums.length;i ++){
			res += nums[i];
		}
		return res;
	}
}