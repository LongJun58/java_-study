public class HouseView {
    //
    private static HouseService houseService = new HouseService();

    //定义布尔变量
    private boolean loop = true;

    public void mainMenu(){
        int option;
        do {
            System.out.println("-----------房屋出租系统-----------");
            System.out.println("\t\t1 新 增 房 屋");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退出");
            do {
                System.out.print("请选择（1-6）:");
                option = Utility.readInt(); // 处理用户输入的数据
                if (option < 0 || option > 6){
                    continue;
                }
                break;
            }while (true);
             switch (option){
                 case 1->{
                     System.out.println("添加房屋");
                     houseService.additionHouses();
                 }
                 case 2->{
                     System.out.println("查找房屋");
                     houseService.seekHouses();
                 }
                 case 3->{
                     System.out.println("删除房屋");
                     houseService.deleteHouses();
                 }
                 case 4->{
                     System.out.println("修改房屋信息");
                     houseService.modifyHouses();
                 }
                 case 5->{
                     System.out.println("房屋列表");
                     houseService.houseListTable();
                 }
                 case 6->{
                     char secondOption = ' ';
                     do {
                         System.out.print("请输入你的选择（Y/N）:");
                         secondOption = Utility.readChar();
                         if (secondOption == 'Y' || secondOption == 'y'){
                             loop = false;
                             System.out.println("退出！");
                         }
                         break;
                     }while (true);
                 }
             }
        }while(loop);
    }
}
