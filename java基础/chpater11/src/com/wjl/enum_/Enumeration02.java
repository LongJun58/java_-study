package com.wjl.enum_;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 * 使用枚举
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER);
        System.out.println(Season01.AUTUMN);
        System.out.println(Season01.WINTER);
    }
}

enum Season01{
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    ;
    private String name;
    private String desc;

    Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
