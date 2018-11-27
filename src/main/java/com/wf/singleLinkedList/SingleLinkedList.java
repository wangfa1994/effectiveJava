package com.wf.singleLinkedList;

/**
 * @Author: wangfa
 * @Date: 2018/11/11 14:25
 * @Description: 单向链表实现
 */
public class SingleLinkedList {

     private Node head;
     private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    
    private class Node{
         private  Object data;
         private Node next;

         public Node(Object data) {
             this.data = data;
         }
    }
    
    
    // 链表头部添加元素
    public Object addHead(Object object){
        Node node = new Node(object);
        if(size ==0){
            head =node;
        }else {
            node.next=head;
            head = node;
        }
        size++;
        return object;
        
    }

    // 在链表头删除元素
    public Object deleteHead(){
        if(size == 0) {
            return null;
        }
        Object obj = head.data;
        if(head.next == null){
            //只有一个结点
            head = null;
        }else{
            head = head.next;
        }
        size--;
        return obj;
    }

    //链表查找：判断链表中是否包含某个元素
    public boolean containObject(Object obj){
        if(size == 0) {
            return false;
        }
        Node n = head;
        while(n != null){
            if(n.data == obj) {
                return true;
            }else {
                n = n.next;
            }
        }
        return false;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return size==0?true:false;
    }

    //返回链表长度
    public int size(){
        return size;
    }
    //正向打印链表
    public void display(){
        if(size == 0){
            System.out.println("链表为空！");
        }
        Node n = head;
        while(n != null){

            System.out.print(n.data+" ");
            n = n.next;

        }
        System.out.println();
    }




}
