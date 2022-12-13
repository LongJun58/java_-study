package com.wjl.SmallChange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *该类完成各个功能
 * */
public class SmallChangeSysOOP {
    //定义钱、余额
    private static double money = 0.0;
    private static double balance = 0.0;

    //定义字符拼接数据
    private String string = "";
    private Date date = null;

    //键盘输入
    private Scanner scanner = new Scanner(System.in);
    private boolean loop = true;

    //零钱通的菜单
    public void mainMenu() {
        do {
            System.out.println("==========零钱通菜单===========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退\t出");
            int input = 0;
            //判断用户输入的数据
            do {
                System.out.print("请选择(1-4):");
                //用户输入
                input = this.scanner.nextInt();
            } while (!(input > 0 && input < 5));
            switch (input) {
                case 1 -> {
                    moneyDetail();
                }
                case 2 -> {
                    benefitEarn();
                }
                case 3 -> {
                    repay();
                }
                case 4 -> {
                    quit(); //退出
                }
            }
        } while (loop );
    }

    //零钱通的明细
    public void moneyDetail() {
        System.out.println("\n=============零钱通明细============");
        if (!this.string.equals("")) {
            System.out.println(string);
        }
    }

    //零钱通收益入账
    public void benefitEarn() {
        System.out.println("=================收益入账=================");
        String str = "";
        System.out.print("请输入您的收益来源：");
        str = scanner.next();
        do {
            System.out.print("请输入您的收益数目：");
            money = this.scanner.nextInt();
        } while (money < 0);
        //收益加入余额中
        balance += money;
        date = new Date();
        record(date,true,str); //记录
    }

    public void repay() {
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
            return;
        }
        //减少余额
        balance -= money;
        date = new Date();
        record(date,false,interpret); //记录
    }

    public void quit() {
        char choice = ' ';
        do {
            System.out.print("请输入您的选择(Y/N)：");
            choice = this.scanner.next().charAt(0);
            if (choice == 'Y' || choice == 'y') { //确定退出
                System.out.println("==========您已退出零钱通系统==========");
                this.loop = false;
            } else if (choice == 'N' || choice == 'n') { //不退出
            } else {
                System.out.println("输入错误，重新输入！");
                continue;
            }
            break;
        } while (true);
    }

    public void record(Date date,Boolean bool,String interpret) {
        SimpleDateFormat mdf = new SimpleDateFormat("yyyy年MM月dd日 KK:mm:ss E");
        if (date != null && bool != null && interpret != null) {
            String detail;
           if (bool){
               detail = interpret + "+" + money + "\t" + mdf.format(date) + "\t余额" + balance;
               //总明细
           }else {
               detail = interpret + "-" +  money + "\t" + mdf.format(date) + "\t余额" + balance;
           }
            this.string += detail + "\n";
        }
    }
}
