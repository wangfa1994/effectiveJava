package com.wf.enums;

/**
 * @Author: wangfa
 * @Date: 2019/2/26 16:45
 * @Description: 可以用作状态枚举类，(类比常量类)
 */
public enum SeasonEnums {

    SPRING("春"),SUMMER("夏"),AUMUTN("秋"),WINTER("冬");


    private String desc;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    SeasonEnums(String desc) {
        this.desc = desc;
    }

    public static  String getDesc(String code){
        if(code !=null){
            for (SeasonEnums seasonEnums : SeasonEnums.values()){
                if(seasonEnums.name().equals(code)){
                    return seasonEnums.getDesc();
                }
            }
        }
        return "null";
    }
}
