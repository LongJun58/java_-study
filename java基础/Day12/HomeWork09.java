public class HomeWork09{
	public static void main(String[] args) {
		Music mc = new Music("������",3.45);
		mc.play();
		mc.getInfo();
	}
}
class Music{
	String name;
	double times;
	public Music(String name,double times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		
		System.out.println("���ڲ��ţ�" + name + "\tʱ����" + times);
	}

	public void getInfo(){
		System.out.println("�������֣�" + name + "\tʱ��:" + times);
	}
}