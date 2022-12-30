package com.wjl.array_;

import java.util.Comparator;

/**
 * @author WangJunLong
 * @version JDK 18
 * @QQ 2396595751
 * @VX Karl_Is_Belief
 * @E-Mail wjl13974749712@163.com
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        //定义数组
        Integer [] arr = {0,9,2,78,6,11,45};
        ArrayExercise01.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer integer1 = (Integer) o1;
                Integer integer2 = (Integer) o2;
                return integer2 - integer1;  //第一个与第二个进行相减，大于0的话证明第二个数小，小于0证明第一个数小
            }
        });
//        ArrayExercise01.sort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
    //定义第一个方法：冒泡排序
    public static void sort(Integer[] arr){
        int temp = 0;
        for (int i = 0;i < arr.length - 1;i ++){
            for (int j = 0;j < arr.length - 1 - i;j ++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //定义第二方法：定义排序
    public static void sort(Integer[] arr, Comparator comparator){
        int temp = 0;
        for (int i = 0;i < arr.length - 1;i ++){
            for (int j = 0;j < arr.length - 1 - i;j ++){
                if (comparator.compare(arr[j],arr[j + 1]) > 0){ //这里决定从小到大，还是从大到小
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
