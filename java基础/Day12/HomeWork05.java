public class HomeWork05{
	public static void main(String[] args) {
		Circle ce = new Circle(5.5);
		ce.showCircumference();
		ce.showCircleArea();
	}
}
class Circle{
	//����뾶
	double radius;
	double PI = 3.14159;
	public Circle(double radius){
		this.radius = radius;
	}

	public void showCircumference(){
		System.out.println("Բ�ܳ���" + PI * radius * 2);
	}
	public void showCircleArea(){
		System.out.println("Բ�����" + PI * radius * radius);
	}
}