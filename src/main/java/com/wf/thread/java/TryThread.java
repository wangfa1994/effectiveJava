package com.wf.thread.java;

import java.io.IOException;

/**
 * @Author: wangfa
 * @Date: 2019/4/12 16:12
 * @Description:
 */
public class TryThread extends Thread {

    public TryThread(String firstName, String secondName, Long delay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.aWhlie = delay;
        // 设置线程为后台线程
        setDaemon(true);

    }

    public static void main(String[] args) {

        Thread first = new TryThread("firstName001","secondName001",200L);
        Thread second = new TryThread("firstName002","secondName002",300L);
        Thread third= new TryThread("firstName003","secondName003",500L);



        System.out.println("press Enter when you have had enough...");
        first.start();
        second.start();
        third.start();

        try{
            // wait until enter key pressed
            System.in.read();
            System.out.println("Enter press ..\n ");
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("Ending main()");
        System.exit(-1);
        return;

    }

    @Override
    public void run() {
        try {
            while (true){

                System.out.println(firstName);
                sleep(aWhlie);
                System.out.println(secondName+"\n");
            }

        }catch (InterruptedException e){
            System.out.println(firstName+secondName+e);
        }
    }


    private String firstName;
    private String secondName;
    private Long aWhlie;


}
