package com.wf.a09OverrideHashCode;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wangfa
 * @Date: 2018/11/14 19:22
 * @Description: 覆盖equals 请总要覆盖hashCode
 */
public class DemoMain {


    public static void main(String[] args) {
        Student student  = new Student.Builder().name("wqj").age(18).build();
        System.out.println(student);

        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date());
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }


        dateList.add(new Date());

        for(Date date:dateList){
            Date date1 = new Date();
            if(DateUtils.isSameDay(date,date1)){
                System.out.println("same");
                continue;
            }
            System.out.println("不一致");
        }


        if (StringUtils.isEmpty("12") || StringUtils.isEmpty("12") || StringUtils.isEmpty("12") || 0.032 <= 0 || StringUtils.isEmpty("12")) {
            System.out.println("error");

        }

    }





















    /**
     * 1. 程序运行期间，equals方法的比较所用的信息没有被修改，则对这同一个对象的多次调用，都应该保证hashCode返回相同的值，
     *      在一个程序中的多次执行，则每次执行所返回的整数可以不一致
     * 2. 如果两个对象的equals方法是相等的，那么调用任一个对象的hashCode方法则都必须返回相同的结果
     *
     * 3. 如果两个对象根据equals方法比较的是不相等的，name调用任一对象的hashCode则【不一定】会产生相同的整数结果。
     *      ps：给不同的对象产生不同的整数结果，有利于提高散列表【hash table】的性能
     *
     */

}
