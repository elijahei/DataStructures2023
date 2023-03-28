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

        System.out.println(bs.levelorderTraversal());
        //System.out.println(bs.inorder());
        System.out.println(bs.delete(10));
        System.out.println(bs.levelorderTraversal());

      

    }

}