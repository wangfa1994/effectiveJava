package com.wf.enums;

/**
 * @Author: wangfa
 * @Date: 2018/11/3 16:14
 * @Description:
 */
public class EnumMain {

    public static void main(String[] args) {

        // 枚举类与switch的使用
        Integer code = 2;
        WorkEnum workEnum = WorkEnum.getWorkEnumBycode(code);
        switch (workEnum) {
            case CALL:
                System.out.println(code + "-CALL");
                break;
            case SMS:
                System.out.println(code + "-SMS");
                break;
            case WECHAT:
                System.out.println(code + "-WECHAT");
                break;
            default:
                throw new RuntimeException("枚举不存在");
        }


        System.out.println(SeasonEnums.getDesc("SPRING"));


    }
}
