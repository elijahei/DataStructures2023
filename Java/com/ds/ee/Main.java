package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
   
        BST<String> bs = new BST<String>();
        bs.insert("elijah");
        bs.insert("hura");
        bs.insert("rishi");
        bs.insert("rahul");
        bs.insert("alan");
        bs.insert("alina");
        bs.insert("edrem");
        System.out.println("checking...");
        System.out.println(bs.levelorderTraversal());
    }

}