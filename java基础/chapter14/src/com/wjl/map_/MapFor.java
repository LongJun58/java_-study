package com.wjl.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘玲博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组：取出所有的key值
        Set keySet = map.keySet();
        //增强for
        for (Object o : keySet) {
            System.out.println(o);
        }
        //迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(map.get(next));
        }
    }
}
