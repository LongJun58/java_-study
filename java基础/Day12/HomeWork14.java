import java.util.*;
public class HomeWork14{
	public static void main(String[] args) {
		//定义两个类
		Personer tom = new Personer();
		Personer ai = new Personer();
		Scanner myscanner = new Scanner(System.in);
		do{
			System.out.print("请输入你的选择，是否开始游戏？(y/n):");
			char cantain = myscanner.next().charAt(0);
			if(cantain == 'Y' || cantain == 'y'){
				
			}else if (cantain == 'n' || cantain == 'N'){
				System.out.println("已经退出游戏！");
				break;
			}else {
				System.out.println("输入错误！请重新输入！");
				continue;
			}
			System.out.print("请输入你的选择（0->石头|1->剪刀|2->布）：");
			tom.boxing = myscanner.nextInt();
			ai.boxing = (int) (0 + Math.random() * (2 - 0 + 1 ));
			if(!tom.combit(ai)){
				continue;
			}
			System.out.println("======tom的成绩======");
			tom.info();
			System.out.println("======电脑的成绩======");
			ai.info();
		}while(true);
	}
}

class Personer{
	//出拳的方式
	int boxing;
	//定义清单
	int []score = new int[3];
	//开始对决
	public boolean combit(Personer personer){
		if(this.boxing < 0 || this.boxing > 2 || personer.boxing < 0 || personer.boxing > 2){
			System.out.println("抱歉！数据错误！");
			return false;
		}
		switch(this.boxing){
			case 0 : //石头
				if(personer.boxing == 0){
					//平局
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("平局");
				}else if(personer.boxing == 1){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tom赢了！");

				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom输了！");
				}
				return true;
			case 1://剪刀
				if(personer.boxing == 1){
					//平局
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("平局");
				}else if(personer.boxing == 2){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tom赢了！");
				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom输了！");
				}
				return true;
			case 2: //布
				if(personer.boxing == 2){
					//平局
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("平局");
				}else if(personer.boxing == 0){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tom赢了！");
				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom输了！");
				}
				return true;
		}
		return true;
	} 

	public void info(){
		System.out.println("赢：" + score[0] + "\t输：" + score[1] + "\t平局：" + score[2]);
	}
}