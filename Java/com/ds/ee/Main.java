package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
   
       MyLinkedList<String> ml = new MyLinkedList<>();
       ml.insert("Elijah");
       ml.insert("Chicago");
       ml.insert("Beckley");
       ml.insert("Nashville");

       System.out.println(ml.getAllElems());
      
       MyLinkedList<String> ml2 = new MyLinkedList<>();
       ml2.insert("Airbus");
       ml2.insert("Boeing");

       ml.Merge(ml2);
       System.out.println(ml.getAllElems());
       System.out.println(ml.size());


    }

}