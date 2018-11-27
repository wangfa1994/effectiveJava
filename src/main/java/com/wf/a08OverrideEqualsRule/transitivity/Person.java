package com.wf.a08OverrideEqualsRule.transitivity;

import java.util.Objects;

/**
 * @Author: wangfa
 * @Date: 2018/11/14 15:46
 * @Description:
 */
public class Person {

    private String name;
    private int age;

    public Person(Builder builder) {
        name =builder.name;
        age =builder.age;
    }

    public  static  class Builder{
        private String name;
        private int age;
        public Builder() {
        }

        public Builder name(String value){
            name=value;
            return this;
        }
        public Builder age(int value){
            age = value;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }

    /**
     *
     */
    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
       if(!(o instanceof Person)){
           return false;
       }
       Person person = (Person) o;
        return person.age ==age && (name == person.name ||(name !=null && name.equals(person.name)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
