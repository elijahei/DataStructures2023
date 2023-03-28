package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
   
        BST<Integer> bs = new BST<Integer>();
        bs.insert(10);
        bs.insert(7);
        bs.insert(25);
        bs.insert(15);
        bs.insert(30);
        bs.insert(27);
        bs.insert(45);
        bs.insert(65);
        bs.insert(75);
        bs.insert(85);


        System.out.println(bs.levelorderTraversal());
        System.out.println(bs.height());

      

    }

}