package com.wf.thread.java;

/**
 * @Author: wangfa
 * @Date: 2019/4/12 15:46
 * @Description: 把单个程序执行为多个线程的重要考虑是:线程不可能有相同的执行时间,当某个线程依赖于另一个线程时,就不能让两个线程同时执行——否则就会出现混乱
 */
public class DemoMain {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }


    /**
     *
     *
     * 在Java中有两类线程：用户线程 (User Thread)、守护线程 (Daemon Thread)。
     * 后台线程是从属于创建它的线程的背景线程,所以当创建它的线程结束时,后台线程也会结束。
     * 不是后台线程的线程称为用户线程。
     *
     *
     *
     */
}
