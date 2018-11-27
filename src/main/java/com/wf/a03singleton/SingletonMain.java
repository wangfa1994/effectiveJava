package com.wf.a03singleton;

/**
 * @Author: wangfa
 * @Date: 2018/11/9 16:44
 * @Description: 用私有构造器或者枚举类型强化singleton属性
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLETON;
        System.out.println(singleton);
    }
}
