package com.wjl.try_;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "王军龙";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        }finally {
            System.out.println("finally代码被执行...");
        }
        System.out.println("程序继续执行..... ");
    }
}
