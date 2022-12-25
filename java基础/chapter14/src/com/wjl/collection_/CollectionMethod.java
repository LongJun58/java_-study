package com.wjl.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //add添加单个元素
        arrayList.add("jack");
        arrayList.add(10);
        arrayList.add(true);
        System.out.println("list:" + arrayList);

        //remove指定删除元素
        arrayList.remove("jack");
        System.out.println(arrayList);

        //contains:查找元素是否存在
        System.out.println(arrayList.contains("jack_"));

        //size获取集合元素个数
        System.out.println(arrayList.size());

        //isEmpty判断集合是否为空
        System.out.println(arrayList.isEmpty());

        //clear清空
//        arrayList.clear();

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("红楼梦");
        arrayList1.add("三国演义");
        //addAll添加多个元素
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        //containAll查找多个元素是否存在
        System.out.println(arrayList.containsAll(arrayList1));

        //removeAll删除多个元素
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
    }
}
