import java.util.*;
public class HomeWork14{
	public static void main(String[] args) {
		//����������
		Personer tom = new Personer();
		Personer ai = new Personer();
		Scanner myscanner = new Scanner(System.in);
		do{
			System.out.print("���������ѡ���Ƿ�ʼ��Ϸ��(y/n):");
			char cantain = myscanner.next().charAt(0);
			if(cantain == 'Y' || cantain == 'y'){
				
			}else if (cantain == 'n' || cantain == 'N'){
				System.out.println("�Ѿ��˳���Ϸ��");
				break;
			}else {
				System.out.println("����������������룡");
				continue;
			}
			System.out.print("���������ѡ��0->ʯͷ|1->����|2->������");
			tom.boxing = myscanner.nextInt();
			ai.boxing = (int) (0 + Math.random() * (2 - 0 + 1 ));
			if(!tom.combit(ai)){
				continue;
			}
			System.out.println("======tom�ĳɼ�======");
			tom.info();
			System.out.println("======���Եĳɼ�======");
			ai.info();
		}while(true);
	}
}

class Personer{
	//��ȭ�ķ�ʽ
	int boxing;
	//�����嵥
	int []score = new int[3];
	//��ʼ�Ծ�
	public boolean combit(Personer personer){
		if(this.boxing < 0 || this.boxing > 2 || personer.boxing < 0 || personer.boxing > 2){
			System.out.println("��Ǹ�����ݴ���");
			return false;
		}
		switch(this.boxing){
			case 0 : //ʯͷ
				if(personer.boxing == 0){
					//ƽ��
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("ƽ��");
				}else if(personer.boxing == 1){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tomӮ�ˣ�");

				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom���ˣ�");
				}
				return true;
			case 1://����
				if(personer.boxing == 1){
					//ƽ��
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("ƽ��");
				}else if(personer.boxing == 2){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tomӮ�ˣ�");
				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom���ˣ�");
				}
				return true;
			case 2: //��
				if(personer.boxing == 2){
					//ƽ��
					this.score[2] ++;
					personer.score[2] ++;
					System.out.println("ƽ��");
				}else if(personer.boxing == 0){
					this.score[0] ++;
					personer.score[1] ++;
					System.out.println("tomӮ�ˣ�");
				}else {
					this.score[1] ++;
					personer.score[0] ++;
					System.out.println("tom���ˣ�");
				}
				return true;
		}
		return true;
	} 

	public void info(){
		System.out.println("Ӯ��" + score[0] + "\t�䣺" + score[1] + "\tƽ�֣�" + score[2]);
	}
}