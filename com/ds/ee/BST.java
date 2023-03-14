package com.ds.ee;


/*
 * A Binary Search Tree of type T
 */

 class BST<T> {

    class BSTNode{ // inner class
        T val;
        BSTNode right;
        BSTNode left;
        BSTNode(T val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    BSTNode root;
    int size;
    
    public BST(){
        this.root = null;
        this.size = 0;
    }

    public BST(T val){
        this.root = new BSTNode(val);
        this.size = 1;
    }


}
