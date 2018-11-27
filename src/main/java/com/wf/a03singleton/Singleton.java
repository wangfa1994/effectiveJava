package com.wf.a03singleton;

/**
 * @Author: wangfa
 * @Date: 2018/11/9 16:42
 * @Description: 用私有构造器或者枚举类型强化singleton属性
 */
public class Singleton {
    private String name;

    private String age;

    public  static  final Singleton SINGLETON = new Singleton();

    private Singleton() {
    }
}
