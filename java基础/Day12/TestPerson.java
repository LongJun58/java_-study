public class TestPerson{
	public static void main(String [] args){
		Prople p1 = new Prople("С��",23);
		Prople p2 = new Prople("С��",23);
		System.out.println(p1.compareTo(p2));
	}
}

class Prople{
	String name;
	int age;
	public Prople(String name,int age){
		this.age = age;
		this.name = name;
	}
	public boolean compareTo(Prople prople){
		return this.name.equals(prople.name) && this.age == prople.age;
	}
}