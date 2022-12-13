package com.wjl.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //完成零钱通项目的实现
    /*
     * 1、先完成显示菜单，并可以选择菜单，给出对应提示
     * 2、使用字符串拼接完成收益入账和明细
     * 3、完成消费的功能
     * 4、完成对确定退出的数据校验
     * */
    public static void main(String[] args) {
        //先定义布尔变量
        boolean loop = true;
        int input;
        String detail = ""; //记录明细
        String amountDetail = ""; // 总明细
        double money = 0.0; //钱
        double balance = 0.0; //余额
        double consumption = 0.0; //消费
        Date date = null;
        SimpleDateFormat mdf = new SimpleDateFormat("yyyy年MM月dd日 KK:mm:ss E");
        //定义键盘输入
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==========零钱通菜单===========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退\t出");

            //判断用户输入的数据
            do {
                System.out.print("请选择(1-4):");
                //用户输入
                input = scanner.nextInt();
            } while (!(input > 0 && input < 5));
            //根据用户输入的不同数据选择不同的功能
            switch (input) {
                case 1 -> {
                    System.out.println("\n=============零钱通明细============");
                    if (amountDetail != null) {
                        System.out.print(amountDetail);
                    }
                }
                case 2 -> {
                    System.out.println("=================收益入账=================");
                    do {
                        System.out.print("请输入您的收益：");
                        money = scanner.nextInt();
                    }while(money < 0);
                    //收益加入余额中
                    balance += money;
                    date = new Date();
                    detail = "收益入账" + "+" + money + "\t" + mdf.format(date) + "\t余额" + balance;
                    //总明细
                    amountDetail += detail + "\n";
                }
                case 3 -> {
                    System.out.println("================消费入口================");
                    String interpret = "";
                    System.out.print("请输入您的消费说明：");
                    interpret = scanner.next();
                    do {
                        System.out.print("请输入您的支出金额：");
                        money = scanner.nextInt();
                    }while (money < 0);
                    if (money > balance){
                        System.out.println("余额不足，无法记录！");
                        break;
                    }
                    //减少余额
                    balance -= money;
                    date = new Date();
                    detail = interpret + "-" + money + "\t\t" + mdf.format(date) + "\t余额" + balance;
                    //总明细
                    amountDetail += detail + "\n";
                }
                case 4 -> {
                    char choice = ' ';
                    do {
                        System.out.print("请输入您的选择(Y/N)：");
                        choice = scanner.next().charAt(0);
                        if (choice == 'Y' || choice == 'y'){ //确定退出
                            System.out.println("==========您已退出零钱通系统==========");
                            loop = false;
                        }else if (choice == 'N' || choice == 'n'){ //不退出
                        }else {
                            System.out.println("输入错误，重新输入！");
                            continue;
                        }
                        break;
                    }while (true);
                }
            }

        } while (loop);
    }

    //校验用户的数据
//    public static boolean check(int data, int mixLimit, int maxLimit) {
//        return data > mixLimit && data < maxLimit + 1;
//    }
}
