package com.wjl.annotation_;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
@Deprecated
//表示已经过时的类和方法、属性、元素、参数
class A{
    @Deprecated
    public void m1(){

    }
}
