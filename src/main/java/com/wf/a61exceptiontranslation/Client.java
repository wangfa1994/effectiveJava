package com.wf.a61exceptiontranslation;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 15:54
 * @Description: 抛出与抽象相对应的异常
 *
 * 异常转义：更高层的实现应该捕获底层的异常，同时抛出可以按照高层抽象进行解释的异常，这种做法称为异常转义。
 * 异常链：低层的异常(原因)被传递到高层的异常之中，高层的异常提供访问方法来获取低层的异常
 */
public class Client {
}
