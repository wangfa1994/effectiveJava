package com.wf.a02beanBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wangfa
 * @Date: 2018/11/9 15:55
 * @Description: 第二条 遇到多个构造器参数时要考虑用构建器
 */
public class BeanBuilderUseMain {

   private static Logger logger = LoggerFactory.getLogger(BeanBuilderUseMain.class);

    public static void main(String[] args) {
        BeanBuilderUse beanBuilderUse= new BeanBuilderUse.Builder().name("tom").age("23").build();
        System.out.println(beanBuilderUse.toString());
        System.out.println(beanBuilderUse.getName());
        System.out.println(beanBuilderUse.getAge());
        String s = "12";
        System.out.println(s.intern()==s);
        String s1 = "123";
        System.out.println(s1.intern()==s1);

        logger.info("zhehsi sha");

        String  str= new StringBuffer("123").append("456").toString();
        System.out.println(str.intern()==str);

        String  str1= new StringBuffer("123").append("456").toString();
        System.out.println(str1.intern()==str1);


    }
}
