package com.wjl.exception_;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int res = 0;
        try {
            res = num1 / num2;
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
