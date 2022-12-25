package com.wjl.try_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class againInputNumber {
    public static void main(String[] args) {

        int num = 0;

        for (; ; ) {
            try {
                //定义键盘输入
                Scanner scanner = new Scanner(System.in);
                System.out.print("请输入一个整数：");
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("类型输入错误：" + e.getMessage());
                continue;
            }
            System.out.println("输入正确！");
            break;
        }
    }
}
