public class VarParameterExercise{
	public static void main(String[] args) {
		Wjlmethods wjl = new Wjlmethods();
		System.out.println(wjl.showscore("С��",91,64,99,84,66));	
	}
}
class Wjlmethods{
	public String showscore(String name,int...score){
		int sum = 0;
		for(int i = 0; i < score.length;i ++){
			sum += score[i];
		}
		return "������" + name + "\t�ܷ֣�" + sum;
	}
}