public class HomeWork10{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.testMethod();
	}
}

class Test{
	public int method(int n1,int n2){
		return n1 + n2;
	}

	public void testMethod(){
		System.out.println(method(method(10,20),200));
	}
}