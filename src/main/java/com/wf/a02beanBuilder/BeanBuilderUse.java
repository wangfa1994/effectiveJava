package com.wf.a02beanBuilder;

import java.util.Objects;

/**
 * @Author: wangfa
 * @Date: 2018/11/9 15:49
 * @Description:
 */
public class BeanBuilderUse {

    private  String name;
    private  String age;
    private  BuilderFactory builderFactory;


    public BeanBuilderUse(Builder builder) {
        name = builder.name;
        age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    /* public static  class Builder{
        private  String name;
        private  String age;

        public Builder() {
        }
        public Builder name(String value){
            name =value;
            return this;
        }
        public Builder age(String value){
            age =value;
            return this;
        }
        public BeanBuilderUse build(){
            return  new BeanBuilderUse(this);
        }
    }*/
   
   public static  class Builder implements BuilderFactory<BeanBuilderUse>{

       private  String name;
       private  String age;

       public Builder() {
       }
       public Builder name(String value){
           name =value;
           return this;
       }
       public Builder age(String value){
           age =value;
           return this;
       }
       @Override
       public BeanBuilderUse build() {
           return  new BeanBuilderUse(this);
       }
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeanBuilderUse that = (BeanBuilderUse) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(builderFactory, that.builderFactory);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, builderFactory);
    }
}
