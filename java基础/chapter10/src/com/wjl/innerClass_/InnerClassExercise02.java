package com.wjl.innerClass_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new CellPhone().test();
    }
}

//接口
interface Bell{
    void ring();
}

//类
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
    public void test(){
        alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了....");
            }
        });

        alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
