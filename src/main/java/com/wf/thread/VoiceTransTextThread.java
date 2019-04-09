package com.wf.thread;

/**
 * @Author: wangfa
 * @Date: 2018/10/31 10:41
 * @Description:
 */
public class VoiceTransTextThread implements Runnable {

    private String recordNo;
    private  Integer tapeId;

    public String getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(String recordNo) {
        this.recordNo = recordNo;
    }

    public Integer getTapeId() {
        return tapeId;
    }

    public void setTapeId(Integer tapeId) {
        this.tapeId = tapeId;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(5000);
            // 线程业务处理
            System.out.println("recordId:"+recordNo+"__tapeId:"+tapeId);
        }catch (Exception e){

        }

    }

    public VoiceTransTextThread() {
    }
    public VoiceTransTextThread(String recordNo, Integer tapeId) {
        this.recordNo = recordNo;
        this.tapeId = tapeId;
    }
}
