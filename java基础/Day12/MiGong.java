public class MiGong{
	public static void main(String[] args){
		//定义一个迷宫，且为二维数组
		int map[][] = new int[8][7];
		for(int i = 0;i < map.length;i ++){
			for(int j = 0;j < map[i].length;j ++){
				map[0][j] = 1;
				map[7][j] = 1;
			}
		}

		for(int i = 0 ; i < map.length;i ++){
			for(int j = 0; j < map[i].length;j ++){
				map[i][0] = 1;
				map[i][6] = 1;
			}
		}
		map[3][1] = 1;
		map[3][2] = 1;
		T t = new T();
		t.FindWay(map,1,1);

		System.out.println("======当前地图=====");
		for(int i = 0 ; i < map.length;i ++){
			for(int j = 0; j < map[i].length;j ++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class T{
	public boolean FindWay(int [][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		}else{
			if(map[i][j] == 0){ //map[i][j] = 0 表示可以走的路
				map[i][j] = 2; //假定可以走，但是走不通的路
				if(FindWay(map,i + 1,j)){
					return true;
				}else if(FindWay(map,i,j + 1)){
					return true;
				}else if(FindWay(map,i - 1,j)){
					return true;
				}else if(FindWay(map,i,j - 1)){
					return true;
				}else{
					map[i][j] =3;
					return false;
				}
			}
			else {
				return false;
			}
		}
		
	}
}