package com.wf.thread;

/**
 * @Author: wangfa
 * @Date: 2018/10/31 10:43
 * @Description: java 线程，传递参数，但是在spring下，讲线程交给spring的线程池管理
 */
public class ThreadMain {


    public static void main(String[] args) {
        VoiceTransTextThread vt = new VoiceTransTextThread("123456",7890);
        Thread thread = new Thread(vt);

        try {
            Thread.sleep(1000);
            System.out.println("234");
            thread.start();
            System.out.println(456);
        }catch (Exception e){

        }

    }
}
