import org.jetbrains.annotations.NotNull;

//该类完成对房屋信息的各种处理
public class HouseService {
    //定义一个变量
    private static int ID = 0;

    private static House[] getHouses() {
        return houses;
    }

    private static void setHouses(House[] houses) {
        HouseService.houses = houses;
    }

    //定义一个数组
    private static House[] houses = new House[2];

    //添加
    public void additionHouses() {
        String name, address, state,phone;
        int  rent,house_id;
        House house;
        //先判断是否需要扩容
        houses = ExpandArray();
        System.out.println("---------------添加房屋----------------");
        do {
            System.out.print("请输入你的姓名：");
            name = Utility.readString(20, "房客");
            System.out.print("请输入你的电话：");
//            phone = Utility.readInt(); //bug
            phone = Utility.readString(13,"888888888");
            System.out.print("请输入你的地址：");
            address = Utility.readString(25);
            System.out.print("请输入月租：");
            rent = Utility.readInt(500);
            System.out.print("请输入房屋当前状态：");
            state = Utility.readString(10, "未出租");
            house = new House(++ID, name, phone, address, rent, state);
            if(!house.isExist()){
                house = null; //数据错误，就跳过重新输入
                System.gc(); //回收
                continue;
            }
            break;
        } while (true);
        //添加到数组当中
        house_id = ID;
        houses[house_id - 1] = house;
        System.out.println("---------添加成功-----------");
    }

    //查找
    public void seekHouses() {
        System.out.println("---------------查找房屋----------------");
        int i = findHouse(houses);
        if(i >= 0) {
            House house = houses[i];
            if (house != null) {
                System.out.println(house);
            }
        }else {
            System.out.println("---------------查找失败-----------------");
        }
    }

    //删除
    public void deleteHouses() {
        int house_id;
        System.out.println("---------------删除房屋----------------");
        house_id = findHouse(houses);
        if (house_id >= 0) {
            //如果存在房屋，就删除
            houses[house_id] = null;
            //进行默认排序
            autoResort(houses);
            System.out.println("----------------删除成功-----------------");
        }else {
            System.out.println("----------------删除失败-----------------");
        }
    }

    //修改
    public void modifyHouses() {
        System.out.println("---------------修改房屋信息----------------");
        int house_id = findHouse(houses);
        if(house_id < 0){
            System.out.println("修改失败，未找到该房屋编号！");
            return;
        }
        String name, address, state,phone;
        int  rent;
        char judge;
        House house = houses[house_id];
        do {
            System.out.print("是否确定修改(Y/N)：");
            judge = Utility.readChar('n');
            if (judge == 'N' || judge == 'n') {
                return;
            }
            System.out.println("----------修改列表--------------");
            System.out.println("\t\t1 名 字");
            System.out.println("\t\t2 电 话");
            System.out.println("\t\t3 地 址");
            System.out.println("\t\t4 月 租");
            System.out.println("\t\t5 状 态");
            System.out.println("\t\t6 退 出 修 改");
            System.out.print("请输入需要修改信息的编号：");
            int number = Utility.readInt();
            switch (number){
                case 1->{
                    System.out.print("请输入名字：");
                    name = Utility.readString(20);
                    house.setHost(name);
                }
                case 2->{
                    do {
                        System.out.print("请输入电话：");
                        phone = Utility.readString(13);
                        if(!house.setPhone(phone)){
                            System.out.println("输入错误，请重新输入！");
                            continue;
                        }
                        break;
                    }while (true);
                }
                case 3->{
                    System.out.print("请输入地址：");
                    address = Utility.readString(20);
                    house.setAddress(address);
                }
                case 4->{
                    do{
                        System.out.print("请输入月租：");
                        rent = Utility.readInt();
                        if(!house.setMonth_rent(rent)){
                            System.out.println("输入错误，请重新输入！");
                            continue;
                        }
                        break;
                    }while (true);
                }
                case 5->{
                    do {
                        System.out.print("请输入状态(已出租/未出租)：");
                        state = Utility.readString(10);
                        if (!house.setStatement(state)) {
                            System.out.println("输入错误，请重新输入！");
                            continue;
                        }
                        break;
                    }while (true);
                }
                case 6->{
                    System.out.println("-----------已经退出修改------------");
                    return;
                }
            }
            do {
                System.out.print("是否继续修改？(Y/N):");
                number = Utility.readChar();
                if (number == 'n' || number == 'N') {
                    return;
                } else if (number == 'y' || number == 'Y') {
                    break;
                } else {
                    System.out.println("输入错误，请重新输入！");
                }
            }while (true);
        }while (true);
    }

    //房屋列表
    public void houseListTable() {
        System.out.println("---------------房屋列表----------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (House house : houses) {
            if (house != null) {
                System.out.println(house);
            }
        }
    }


    //自动排序功能
    private void autoResort(House @NotNull [] hse) {
        House house;
        //对每次操作的数值进行排序
        for (int i = 0; i < hse.length;i ++){
            for (int j = 0;j < hse.length -1 -i;j ++ ){
                if (hse[j] == null || hse[j + 1] == null){
                    break;
                }
                if(hse[j] != null && (hse[j].getHouse_id() > hse[j + 1].getHouse_id())){
                    house = hse[j];
                    hse[j] = hse[j + 1];
                    hse[j + 1] = house;
                }
            }
        }
    }

    //功能查找房屋
    private int findHouse(House[] hse){
        int house_id;
        do {
            System.out.print("请输入房屋的编号：");
            house_id = Utility.readInt();
            if (house_id < 0 || house_id > hse.length){
                System.out.print("输入的房屋编号不合法，请重新输入！");
                continue;
            }
            //进行查找
            for (int i = 0;i < hse.length;i ++){
                if(hse[i] != null){
                    if (hse[i].getHouse_id() == house_id){
                        house_id = i;
                        break;
                    }
                }else {
                    if (i == hse.length -1){
                        System.out.println("没有找到该编号的房屋...");
                        house_id = -1;
                        break;
                    }
                }
            }
            return house_id;
//            if (judge > 0) {
//                break;
//            }else{
//                System.out.println("输入的房屋编号不存在，请重新输入！");
//                continue;
//            }
        }while (true);
    }

    private House[] ExpandArray(){
        //先进行排序
        autoResort(houses);
        for (int i = 0;i < houses.length;i ++){
            if (i == houses.length - 1 && houses[i] != null) {
                House [] newHouses = new House[(houses.length + 1) * 2];
                for (int j = 0;j < houses.length;j ++){
                    newHouses[j] = houses[j]; //进行扩容
                    System.gc(); //回收
                }
                return newHouses;
            }
        }
        return houses; //无操作
    }
}
