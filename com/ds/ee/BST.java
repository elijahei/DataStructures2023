package com.ds.ee;

import java.util.List;
import java.util.ArrayList;


/*
 * A Binary Search Tree of type T
 */

 public class BST {

    class BSTNode{ // inner class
        int val;
        BSTNode right;
        BSTNode left;
        BSTNode(int val){
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

    public BST(int val){
        this.root = new BSTNode(val);
        this.size = 1;
    }


    public int size(){
        return this.size;
    }

    public boolean insert(int val){
        if(this.root == null){
            root = new BSTNode(val);
            size += 1;
            return true;
        }
        else{
            if(this.root.val > val){
                this.root.left = new BSTNode(val);
                size+=1;
                return true;
            }
            else if(this.root.val < val){
                this.root.right = new BSTNode(val);
                size+=1;
                return true;
            }
            else{ // equal case
                return false;
            }
        }
       //return false;
    }

    public List<Integer> inorderTraversal(){
        //TODO: implement this 
        return null;
    }

    public List<Integer> levelorderTraversal(){
        //TODO: implement this 
        return null;
    }
    


    public static void main(String[] args) {
       
        
        BST b = new BST(5);
        System.out.println(b.size());
        b.insert(10);
        System.out.println(b.size());

    }


}
