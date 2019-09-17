package com.wf.a60usestandexception;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 15:33
 * @Description: 优先使用标准的异常
 *
 * 代码重用对于异常也不例外：重用现有的异常的一个好处就是，使你的api更加学习和使用，而且可读性比较好，不会产生许多程序员不熟悉的异常
 * 最常见的可重用异常
 *  IllegalArgumentException 非null的参数异常
 *  IllegalStatusException 对于方法调用而言，对象状态不合适
 *  NullPointerException 禁止使用null的参数，使用了null
 *
 *  对于基础exception 的使用可以查看相关开源框架自定义的异常类
 *  {
 *       private String errorMessage;
        private String errorCode;
        private String requestId;
        private String hostId;
        private String rawResponseError;
 *  }
 *
 */
public class Client {

}
