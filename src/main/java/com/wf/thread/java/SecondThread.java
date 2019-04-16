package com.wf.thread.java;

/**
 * @Author: wangfa
 * @Date: 2019/4/12 18:04
 * @Description:
 */
public class SecondThread extends Thread {


    @Override
    public void run() {
        while (true){
            System.out.println("secondThread is run ...");
        }
    }
}
