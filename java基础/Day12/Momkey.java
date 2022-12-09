public class Momkey{
	public static void main(String [] args){
		System.out.println(Momkey.peach(1));
	}

	public static int peach(int day){
			if(day == 10){
				return 1;
			}else{
				return peach(day + 1) * 2;
			}
	}
}