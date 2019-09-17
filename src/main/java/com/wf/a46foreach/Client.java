package com.wf.a46foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 16:37
 * @Description: for-each 循环优先于传统的for循环
 *
 * 比起普通的for，for-each可能还会存在性能优势：因为他对数组索引的边界值只计算一次。
 */
public class Client {


    public static void main(String[] args) {

        // 1.5 之前，对于集合的遍历 迭代和索引变量会造成混乱，并且也代表着出错
        List<String> list = new ArrayList<>();

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        String[] strings  = new String[12];
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }

        // 1.5 使用for-each
        for (String s : list){
            System.out.println(s);
        }
        for(String s: strings){
            System.out.println(s);
        }
    }
}
