public class HomeWork13{
	public static void main(String[] args) {
		PassObject po = new PassObject();
		Circler c1 = new Circler();
		System.out.println("Radius\t\t\tArea");
		for(int i = 1;i <= 5;i ++){
			po.printAreas(c1,i);
		}
	}
}

class Circler{
	double radius;
	// public Circler(double radius){
	// 	this.radius = radius;
	// }
	public double findArea(){
		return 3.141592653589793 * radius * radius;
	}
}

class PassObject{
	public void printAreas(Circler cl,double times){
		cl.radius = times;
		System.out.println(times + "\t\t\t" + cl.findArea());
	}
}