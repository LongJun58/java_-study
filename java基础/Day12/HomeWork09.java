public class HomeWork09{
	public static void main(String[] args) {
		Music mc = new Music("稻花香",3.45);
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
		
		System.out.println("正在播放：" + name + "\t时长：" + times);
	}

	public void getInfo(){
		System.out.println("本次音乐：" + name + "\t时长:" + times);
	}
}