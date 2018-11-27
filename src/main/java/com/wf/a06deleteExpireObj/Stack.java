package com.wf.a06deleteExpireObj;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @Author: wangfa
 * @Date: 2018/11/12 16:07
 * @Description:
 */
public class Stack {

    private  Object[] elements;
    private  int size;
    private static  final int DEFAULT_INITIAL_CAPACITY=16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object element){
        ensureCapacity();
        elements[size++]=element;
    }
    public Object pop(){
        if(size==0){
            // 抛出空栈的异常
            throw  new EmptyStackException();
        }
        Object element = elements[--size];
        // 清空引用
        elements[size]=null;
        return element;
    }


    private void ensureCapacity() {
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2*size+1);
        }
    }

    /**
     *  如果一个栈是先增长，再进行收缩，那么，从栈中弹出的对象不会被当做垃圾回收，即使使用的栈的程序不再引用这些对象。
     *  这是因为，栈内部维护着对这些对象的过期引用(永远不会再被解除的引用)
     *
     *  解决 一旦对象引用已经过期，要记得清空这些引用即可。
     *  不要过分小心，没有必要一个对象引用一旦不用就把他清空，在紧凑的作用域范围内定义的变量，这种清空会自然发生
     *
     *
     *  只要是类自己管理自己的内存时，就应该注意内存泄漏问题，一旦元素被释放掉，则该元素中包括的任何对象引用都应该被清空。
     *
     *  内存泄漏的三种情况：对象没有及时回收，缓存，监听器和其他回调 （可以借助Heap剖析工具 heap profiler工具进行查看）
     *
     */
}
