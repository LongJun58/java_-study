public class HomeWork01{
	public static void main(String[] args){
		//定义现金
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
		System.out.println("可以经过路口"+count+"次");
	}
}