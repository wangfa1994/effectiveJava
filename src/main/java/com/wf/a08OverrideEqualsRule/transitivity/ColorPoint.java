package com.wf.a08OverrideEqualsRule.transitivity;

import java.util.Objects;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 18:26
 * @Description: 为这个点增加一个颜色
 */
public class ColorPoint extends Point {

    //private final Point point;
    private final Color color;

    public ColorPoint(int x,int y,Color color){
        super(x,y);
        this.color = color;
    }


    /**
     * 在不重写equals时，会继承Point的，在做equals时，颜色信息就会被忽略掉
     */

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  ColorPoint)){
            return  false;
        }
        return super.equals(o) && ((ColorPoint)o).color == color;
    }
    // 在进行有色点与普通点的比较时，可能会得到不同的结果，前面是忽略了颜色信息，后者总是返回false，因为参数类型不正确。

}


