package com.wf.thread;

/**
 * @Author: wangfa
 * @Date: 2018/10/31 10:43
 * @Description: java 线程，传递参数，但是在spring下，讲线程交给spring的线程池管理
 */
public class ThreadMain {


    public static void main(String[] args) {
        // 线程传递参数
        VoiceTransTextThread vt = new VoiceTransTextThread("123456",7890);
        Thread thread = new Thread(vt);

        try {
            // 业务处理
            System.out.println("234");

            // 开启线程处理
            thread.start();
            //业务处理
            System.out.println(456);
        }catch (Exception e){

        }

    }
}
