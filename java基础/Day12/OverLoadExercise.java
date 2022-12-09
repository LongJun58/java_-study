public class OverLoadExercise{
	public static void main(String[] args) {
		Methods md = new Methods();
		md.m(2);
		md.m(2,3);
		md.m("ÄãºÃ");
	}
}
class Methods{
	public void m(int n){
		System.out.println(n*n);
	}

	public void m(int n1,int n2){
		System.out.println(n1*n2);
	}
	public void m(String str){
		System.out.println("str=" + str);
	}
}