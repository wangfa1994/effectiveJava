package com.wf.a59voiduseexception;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 15:13
 * @Description: 避免不必要的使用受检的异常
 *
 * 过分的使用受检异常会使api使用起来非常不方便。如果抛出一个或者多个受检异常，调用该方法的代码就必须在一个或者多个catch中进行处理。
 * 把受检异常变成未受检异常的一种方式是，把这个抛出异常的方法分成两个方法，其中第一个方法返回boolean，表明是否应该抛出异常。
 *
 *
 */
public class Client {
}
