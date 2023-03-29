package com.ds.ee;
import java.util.List;
import java.util.ArrayList;


/*
 * File: MyLinkedList.java
 * Author: Elijah Einstein <einsteine98@gmail.com>
 */

public class MyLinkedList<T extends Comparable> {


    private class ListNode{
        T elem;
        ListNode next;
        ListNode(T elem, ListNode next){
            this.elem = elem;
            this.next = next;
        }
    }


    private ListNode head;
    private int size;


    public int size(){
        return this.size;
    }

    public void insert(T elem){
        if(this.head == null){
            head = new ListNode(elem, null);
        }
       
        else{
            this.head = new ListNode(elem, this.head);
        }
        this.size += 1;
    }


    public boolean remove(T elem){

        if(this.head == null) 
            return false;
        
        if(this.head.elem.compareTo(elem) == 0){
            this.head = this.head.next;
        }

        else{
            ListNode curr = this.head;
            while(curr.next != null && curr.next.elem.compareTo(elem) != 0){
               curr = curr.next;
            }
            if(curr.next == null){ // elem not found
                return false;
            }
            ListNode newNext = curr.next.next;
            curr.next = newNext;
        }
        this.size -= 1;
        return true;
    }

    public boolean find(T elem){

        ListNode curr = this.head;
        while(curr != null){
            if(curr.elem.compareTo(elem) == 0)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public List<T> getAllElems(){
        List<T> retList = new ArrayList<T>();
        ListNode curr = this.head;
        while(curr != null){
            retList.add(curr.elem);
            curr = curr.next;
        }
        return retList;
    }

    public T pop(){
        if(this.head == null){
            throw new RuntimeException("MyLinkedList is Empty!");
        }
        T retVal = this.head.elem;
        this.head = this.head.next;
        return retVal;
    }

    public boolean update(T oldElem, T newElem){
        if(this.head == null)
            return false;
        ListNode curr = this.head;
        while(curr != null){
            if(curr.elem.compareTo(oldElem) == 0){
                curr.elem = newElem;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    
    public void Merge(MyLinkedList<T> oml){

        if(this.head == null){
            this.head = oml.head;
            this.size = oml.size;
            return;
        }

        ListNode curr = this.head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = oml.head;
        this.size += oml.size;
    }

    public void removeDuplicates(){
        // TODO: implement this
    }
    
}
