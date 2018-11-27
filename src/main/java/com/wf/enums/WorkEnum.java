package com.wf.enums;

/**
 * @Author: wangfa
 * @Date: 2018/10/18 16:11
 * @Description:
 */
public enum WorkEnum {

    WORKNUM("1","WORKNUM"),
    SHOPNUM("2","SHOPNUM");


    private String code;
    private String desc;

    WorkEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getBussinesssNo() {
        return code;
    }

    public void setBussinesssNo(String code) {
        this.code = code;
    }

    public String getBussinessName() {
        return desc;
    }

    public void setBussinessName(String desc) {
        this.desc = desc;
    }

    public static WorkEnum getSexEnumByCode(String code){
        for(WorkEnum sexEnum : WorkEnum.values()){
            if(code.equals(sexEnum.getBussinesssNo())){
                return sexEnum;
            }
        }
        return null;
    }


}
