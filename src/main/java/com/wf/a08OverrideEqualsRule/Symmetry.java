package com.wf.a08OverrideEqualsRule;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 17:13
 * @Description: 对称性
 */
public final class Symmetry {

    private final String s;

    public Symmetry(String s){
        if(s==null){
            throw new NullPointerException();
        }
        this.s =s;
    }

  /*  //有问题版
    @Override
    public boolean equals(Object o) {
       if(o instanceof  Symmetry){
           return s.equalsIgnoreCase(((Symmetry)o).s);
       }
       if(o instanceof String){
           return  s.equalsIgnoreCase((String) o);
       }
       return false;
    }
    */

    // 解决问题版
    @Override
    public boolean equals(Object o) {
        return o instanceof Symmetry && ((Symmetry)o).s.equalsIgnoreCase(s);
    }
}
