package com.ds.ee;


public class Main{
    public static void main(String[] args) {
       
    //    Trie t = new Trie();
    //    t.insertString("Puja");
    //    t.insertString("put");

    //   System.out.println(t.getAllStrings());

        BST<Integer> bs = new BST<Integer>();
        bs.insert(10);
        bs.insert(5);
        bs.insert(4);
        bs.insert(20);
        bs.insert(15);
        System.out.println("checking...");
        System.out.println(bs.levelorderTraversal());
    }

}