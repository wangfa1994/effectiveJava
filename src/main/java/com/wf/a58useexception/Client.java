package com.wf.a58useexception;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 14:52
 * @Description: 对可恢复的情况使用受检异常，对编程错误使用运行时异常。
 *
 * 在决定使用受检异常或者是未受检异常时，主要原则是：如果期望调用者能够适当地恢复，对于这种情况就应该使用受检异常，
 * 通常通过抛出受检异常，强迫调用者在一个catch字句中处理改异常，或者将它传播出去。
 * 方法中申明要抛出去的每个受检异常，都是对api用户的一种潜在提示:与异常相关联的条件是调用这个方法的一种可能的结果
 */
public class Client {


    public static void main(String[] args) {

    }
}
