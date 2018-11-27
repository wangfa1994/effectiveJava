package com.wf.a08OverrideEqualsRule.transitivity;

import java.util.Objects;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 18:04
 * @Description: 子类增加信息会影响到equals的比较结果
 */
public class Point {

    private final int x;
    private final int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  Point)){
            return false;
        }
        Point p =(Point)o;
        return p.x ==x && p.y ==y;
    }



}