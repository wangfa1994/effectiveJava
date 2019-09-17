package com.wf.a57exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 14:21
 * @Description:  只针对异常的情况才使用异常
 * 异常应该只用于异常的情况下，他们永远不应该用于正常的控制流
 *
 */
public class Client {

    public static void main(String[] args) {

        int length = 100000;
        Mountain [] mountains = new Mountain[length];
        for (int i = 0; i <length ; i++) {
            Mountain m = new Mountain("name"+i);
            mountains[i] = m;
        }


        // 企图利用异常控制循环
        long start = System.currentTimeMillis();
        try {
            int i= 0;
            while (true){
                mountains[i++].climb();
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }

        long end = System.currentTimeMillis();
        System.out.println("===="+(end-start));


        // 正常模式
        long start1 = System.currentTimeMillis();
        for (Mountain m : mountains){
            m.climb();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("===="+(end1-start1));



        // 遍历的两种方式
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        for (Iterator<String> it=list.iterator();it.hasNext();){
            String next =it.next();
            System.out.println(next);
        }
    }
}
