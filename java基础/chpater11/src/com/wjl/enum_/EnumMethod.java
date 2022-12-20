package com.wjl.enum_;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class EnumMethod {
    public static void main(String[] args) {

        Season01 autumn = Season01.AUTUMN;
        //返回当前对象的位置号（常量名），子类中不能重写
        System.out.println(autumn.name());

        //返回enum类当前对象在枚举当中的位置号，默认从0开始
        System.out.println(autumn.ordinal());

        //返回当前枚举类中的所有的常量
        Season01[] values = Season01.values();
        for (Season01 value : values) {
            System.out.println(value);
        }

        //返回当前枚举类的常量字符串的对象，该字符串必须在枚举类当中是存在的，否则就报错
        Season01 spring = Season01.valueOf("SPRING");
        System.out.println(spring);

        //比较两个枚举常量，比较的是位置编号，如果等于0，为同一个常量对象，小于0，前者位置在后者位置前面
        //大于0，前者位置在后者位置后面
        System.out.println(Season01.valueOf("WINTER").compareTo(spring));
    }
}
