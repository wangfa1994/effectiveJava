package com.wf.a66synchronizeddata;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangfa
 * @Date: 2019/4/9 17:36
 * @Description: 同步访问 共享的可变数据
 */
public class DemoMain {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

       // stopThread();
        stopThread2();
        return;

    }

    /**
     *
     */
    private static void stopThread() throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (!stopRequested){
                    i++;
                }
            }
        });
        Calendar begin = Calendar.getInstance();
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(2);
        stopRequested = true;
        Calendar end = Calendar.getInstance();
        System.out.println("时间s:"+(end.getTimeInMillis() -begin.getTimeInMillis())/1000);

    }

    /**
     *
     * while(!done){
     * }
     * jvm 将while优化为
     * if(!done){
     *     while(true){
     *     }
     * }
     *
     */




    private static synchronized void requestedStop(){
        stopRequested = true;
    }
    private static synchronized boolean stopReqursted(){
        return stopRequested;
    }

    public static  void  stopThread2() throws InterruptedException{
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (!stopReqursted()){
                    i++;
                }
            }
        });
        Calendar begin = Calendar.getInstance();
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        requestedStop();
        Calendar end = Calendar.getInstance();
        System.out.println("时间s:"+(end.getTimeInMillis() -begin.getTimeInMillis())/1000);

    }
}
