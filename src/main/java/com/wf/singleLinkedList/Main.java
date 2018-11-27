package com.wf.singleLinkedList;

/**
 * @Author: wangfa
 * @Date: 2018/11/11 14:56
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead(1);
        singleLinkedList.addHead(12);
        singleLinkedList.addHead(123);
        singleLinkedList.display();
        System.out.println(singleLinkedList.size());
        Object o = singleLinkedList.deleteHead();
        System.out.println("表头"+o);
        singleLinkedList.display();
        System.out.println(singleLinkedList.size());
    }
}
