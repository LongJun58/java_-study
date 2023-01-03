package com.wjl.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        //创建一个HashMap对象
        Map hashMap = new HashMap();
        //放入key-value值
        hashMap.put("no1","张无忌");
        hashMap.put("no2","小龙女");
        hashMap.put("no3","杨过");

        //因为底层经过处理，在hashmap集合key——value存放是Node类对象，但是在存放时，会把key——value值放入Map.entry接口实现的集合中
        //该集合：Set<Entry<K,V>>，这时放入集合中的元素却是entry，此时元素是key值和value值，但是在hashmap中实际存放的还是Map.Node
        Set set = hashMap.entrySet();  //可以得到Map.entry存放key-value的集合
        for (Object obj : set) {
            //进行向下转型
            Map.Entry entry = (Map.Entry) obj;
            //通过Map.entry可以得到key值的集合和value值的集合
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //同样，也可以得到存放的key值集合和value集合
        Set keySet = hashMap.keySet();
        Collection values = hashMap.values();
    }
}
