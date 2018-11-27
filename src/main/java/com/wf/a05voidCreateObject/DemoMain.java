package com.wf.a05voidCreateObject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 15:51
 * @Description: 避免创建不必要的对象
 */
public class DemoMain {


    public static void main(String[] args) {
        // 自动装箱和自动拆箱 会创建不必要的多余对象 要优先使用基本类型而不是装箱基本类型 当心无意识的自动装箱
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        long sum = 0L;
        //Long sum = 0L;
        for(long i=0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
