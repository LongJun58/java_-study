public class HomeWork06{
	public static void main(String[] args) {
		//������������
		Cale c1 = new Cale(76,20);
		Cale c2 = new Cale(7,20);
		c1.sum();
		c1.minus();
		c1.multiple();
		c1.divisor();

		c2.sum();
		c2.minus();
		c2.multiple();
		c2.divisor();
	}
}

class Cale{
	int opreator1;
	int opreator2;
	public Cale(int opreator1,int opreator2){
		this.opreator1 = opreator1;
		this.opreator2 = opreator2;
	}

	public void sum(){
		System.out.println("�ͣ�" + (opreator1 + opreator2));
	}

	public void minus(){
		System.out.println("�" + (opreator1 - opreator2));
	}
	public void multiple(){
		System.out.println("�ˣ�" + (opreator1 * opreator2));
	}
	public void divisor(){
		if(opreator1 == 0 || opreator2 == 0){
			System.out.println("Ҫ���������Ϊ0");
			return;
		}
		System.out.println("����" + (opreator1 / opreator2));
	}
}