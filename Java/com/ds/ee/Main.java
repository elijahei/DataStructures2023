package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
   
       MyLinkedList<String> ml = new MyLinkedList<>();
       ml.insert("Elijah");
       ml.insert("Chicago");
       ml.insert("Beckley");
       ml.insert("Nashville");

       System.out.println(ml.getAllElems());    
       ml.remove("Beckley");
       System.out.println(ml.getAllElems());
       System.out.println(ml.size());

      

    }

}