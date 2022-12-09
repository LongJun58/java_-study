public class SwitchExercise02{
	public static void main(String[] args) {
		double achievement = 89.9;
		switch(achievement < 60 ? 60 : 99 ){
			case 60:
				System.out.println("不及格！");
				break;
			case 99:
				System.out.println("及格！");
				break;
			
		}
	}
}