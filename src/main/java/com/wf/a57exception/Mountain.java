package com.wf.a57exception;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 14:21
 * @Description:
 */
public class Mountain  {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mountain(String name) {
        this.name = name;
    }

    public void climb(){
        //System.out.println("--"+name);
    }
}
