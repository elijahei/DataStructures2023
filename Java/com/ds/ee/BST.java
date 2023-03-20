package com.ds.ee;

import java.util.List;
import java.util.ArrayList;
import java.io.*;


/*
 * A Binary Search Tree that stores ints, this tree does not store duplicates
 */

 class BST<T extends Comparable> {

    class BSTNode { // inner class
        T val;
        BSTNode right;
        BSTNode left;
        BSTNode(T val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    private BSTNode root;
    private int size;
    
    public BST(){
        this.root = null;
        this.size = 0;
    }

    public BST(T val){
        this.root = new BSTNode(val);
        this.size = 1;
    }


    public int size(){
        return this.size;
    }

    public boolean insert(T val){
        if(this.root == null){
            this.root = new BSTNode(val);
            size += 1;
            return true; 
        }
       
        return insertInternal(val, this.root);
    }

    private boolean insertInternal(T val, BSTNode root){
        
        if(root.val == val){ // duplicate value
            return false;
        }
        else{
            if(val < root.val){
                if(root.left == null){
                    root.left = new BSTNode(val);
                    size += 1; 
                    return true;
                }
                else
                    return insertInternal(val, root.left);
            }

            if(val > root.val){
                if(root.right == null){
                    root.right = new BSTNode(val);
                    size += 1; 
                    return true;
                }
                else
                    return insertInternal(val, root.right);
            }

        }
        
        return false;
    }

    public List<Integer> inorder(){
        
        return inorderHelper(root, new ArrayList<Integer>());
    }

    private List<Integer> inorderHelper(BSTNode root, List<Integer> runningOrder){
        
        if(root != null){
            inorderHelper(root.left, runningOrder);
            runningOrder.add(root.val);
            //System.out.println("adding: " + root.val );
            inorderHelper(root.right, runningOrder);
           // return runningOrder;
        }


        return runningOrder;
    }
    

    public List<Integer> levelorderTraversal(){
        //TODO: implement this 

        return null;
    }
    


    public static void main(String[] args) {
       
        
       

     


    }


}
