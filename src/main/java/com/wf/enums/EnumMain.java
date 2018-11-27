package com.wf.enums;

/**
 * @Author: wangfa
 * @Date: 2018/11/3 16:14
 * @Description:
 */
public class EnumMain {

    public static void main(String[] args) {

        System.out.println(WorkEnum.SHOPNUM.getBussinessName());
        System.out.println(WorkEnum.getSexEnumByCode("1"));
    }
}
