public class House {
    private boolean isExist;

    public boolean isExist() {
        return isExist;
    }

    private void setExist(boolean exist) {
        isExist = exist;
    }

    //定义一个房屋类
    //房屋编号
    private int house_id;

    //房屋房主
    private String host;

    //电话
    private String phone;

    //地址
    private String address;

    //月租
    private int month_rent;

    //状态
    private String statement;

    public House(int house_id, String host, String phone, String address, int month_rent, String statement) {
        if (!(setHouse_id(house_id) && setPhone(phone) && setMonth_rent(month_rent) && setStatement(statement))){
            System.out.println("参数错误！");
            setExist(false);
            return;
        }
        setHost(host);
        setAddress(address);
        setExist(true); //创建成功
    }

    public int getHouse_id() {
        return house_id;
    }

    public boolean setHouse_id(int house_id) {
        if (house_id > 0) {
            this.house_id = house_id;
            return true;
        } else {
            System.out.println("编号输入错误！");
            return false;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPhone() {
        return phone;
    }

    public boolean setPhone(String phone) {
        int compareTo = phone.compareTo(phone); //转为整形
        if (compareTo < 100) {
            this.phone = phone;
            return true;
        } else {
            System.out.println("电话不能低于两位数....");
            return false;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMonth_rent() {
        return month_rent;
    }

    public boolean setMonth_rent(int month_rent) {
        if (month_rent > 500) {
            this.month_rent = month_rent;
            return true;
        } else {
            System.out.println("租金不能低于500！");
            return false;
        }
    }

    public String getStatement() {
        return statement;
    }

    public boolean setStatement(String statement) {
        if (statement.equals("未出租") || statement.equals("已出租")) {
            this.statement = statement;
            return true;
        } else {
            System.out.println("输入不合法....");
            return false;
        }
    }

    @Override
    public String toString() {
        return this.house_id + "\t\t" + this.host + "\t\t" + this.phone + "\t\t"
                + this.address + "\t\t" + this.month_rent + "\t\t" + this.statement;
    }
}
