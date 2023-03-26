package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
   
        BST<String> bs = new BST<String>();
        bs.insert("MtAiry");
        bs.insert("Nashville");
        bs.insert("Beckley");
        bs.insert("Dayton");
        bs.insert("Chicago");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(bs.levelorderTraversal());
        System.out.println(bs.inorder());
        System.out.println(bs.preorder());
        System.out.println(bs.postorder());
    }

}