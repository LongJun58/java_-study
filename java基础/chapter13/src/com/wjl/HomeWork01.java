package com.wjl;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        //定义一个字符串
        String str = "abcdsdasa";
        String reverse = reverse(str, 1, 6);
        System.out.println(reverse + "类型：" + reverse.getClass());
    }

    public static String reverse(String str,int start,int end){
        char[] chars = str.toCharArray();
        char ch = ' ';
        while(true) {
            if (start >= end) {
                break;
            }
            ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        String string = Arrays.toString(chars);
        return string;
    }
}