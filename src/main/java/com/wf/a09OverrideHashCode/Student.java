package com.wf.a09OverrideHashCode;

/**
 * @Author: wangfa
 * @Date: 2018/11/15 10:32
 * @Description:
 */
public class Student {
    private String name;
    private int age;

    public Student (Builder builder){
        name = builder.name;
        age = builder.age;
    }

    public  static  class Builder{
        private String name;
        private int age;

        public Builder name(String value){
            name =value;
            return this;
        }
        public Builder age(int value){
            age =value;
            return this;
        }

        public Student build()
        {
            return  new Student(this);
        }
    }
}
