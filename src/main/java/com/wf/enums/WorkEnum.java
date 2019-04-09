package com.wf.enums;

/**
 * @Author: wangfa
 * @Date: 2018/10/18 16:11
 * @Description:
 */
public enum WorkEnum {

    CALL(1,"CALL"),
    SMS(2,"SMS"),
    WECHAT(3,"WECHAT");



    private Integer code;
    private String desc;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    WorkEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static WorkEnum getWorkEnumBycode(Integer code){
        if (code == null){
            return null;
        }
        for (WorkEnum workEnum : WorkEnum.values()){
            if(workEnum.getCode().equals(code)){
                return workEnum;
            }
        }
        return null;
    }


}
