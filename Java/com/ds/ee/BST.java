package com.ds.ee;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;


/*.
 * File: BST.java
 * Author: Elijah Einstein <einsteine98@gmail.com>
 * 
 */

/*
 * A Binary Search Tree that stores ints, this tree does not store duplicates
 */

 public class BST<T extends Comparable> {

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
            if(val.compareTo(root.val) < 0){
                if(root.left == null){
                    root.left = new BSTNode(val);
                    size += 1; 
                    return true;
                }
                else
                    return insertInternal(val, root.left);
            }

            if(val.compareTo(root.val) > 0){
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

    // delete eleme from bst if elem is in bst and return true, else return false
    public boolean delete(T elem){

        

        return deleteHelper(null, root, elem);
    }


    private boolean deleteHelper(BSTNode parent, BSTNode curr, T elem){

        
        if(curr == null){
            return false;
        }
        
        if(curr.val.compareTo(elem) == 0){ // curr to be deleted
            if(curr.left == null && curr.right != null){
                if(parent != null){ // non root
                    if(parent.left == curr){
                        parent.left = curr.right;
                    }
                    else{
                        parent.right = curr.right;
                    }
                    this.size -= 1;
                    return true;
                }
                else{ // TODO: implement root node case

                }
            }

            if(curr.right == null && curr.left != null){
                if(parent != null){
                    if(parent.left == curr){
                        parent.left = curr.left; 
                    }
                    else{
                        parent.right = curr.left;
                    }
                    this.size -= 1;
                    return true;
                }
                else{ // TODO: implement root node case

                }
            }

            if(curr.right == null && curr.left == null){
                if(parent != null){
                    if(parent.left == curr){
                        parent.left = null;
                    }
                    else{
                        parent.right = null;
                    }
                    this.size -=1; 
                    return true;
                }
                else{ // TODO: implement root node case

                }
            }

            if(curr.right != null && curr.left != null){
                // TODO: implement this
            }
        }
        

        return false;
    }


    // return true if key is in bst, else return false
    public boolean isPresent(T key){
        

        return isPresentHelper(root, key);
    }

    private boolean isPresentHelper(BSTNode root, T key){

        if(root == null){
            return false;
        }

        if(root.val.compareTo(key) == 0){ // key found
            return true;
        }

        return isPresentHelper(root.left, key) || isPresentHelper(root.right, key);
    }

    public List<T> inorder(){
        
        return inorderHelper(root, new ArrayList<T>());
    }

    private List<T> inorderHelper(BSTNode root, List<T> runningOrder){
        
        if(root != null){
            inorderHelper(root.left, runningOrder);
            runningOrder.add(root.val);
            //System.out.println("adding: " + root.val );
            inorderHelper(root.right, runningOrder);
           // return runningOrder;
        }


        return runningOrder;
    }

    public List<T> preorder(){
        return this.preorderHelper(root, new ArrayList<T>());
    }
    
    private List<T> preorderHelper(BSTNode root, List<T> runningOrder){
        if(root != null){
            runningOrder.add(root.val);
            preorderHelper(root.left, runningOrder);
            preorderHelper(root.right, runningOrder);
        }
        return runningOrder;
    }


    public List<T> postorder(){
        return this.postorderHelper(root, new ArrayList<T>());
    }
    
    private List<T> postorderHelper(BSTNode root, List<T> runningOrder){
        if(root != null){
            
            postorderHelper(root.left, runningOrder);
            postorderHelper(root.right, runningOrder);
            runningOrder.add(root.val);
        }
        return runningOrder;
    }


    public List<List<T>> levelorderTraversal(){
        

        List<List<T>> topList = new ArrayList<List<T>>();
        List<T> levelList = new ArrayList<T>();

        Queue<BSTNode> levelNodes = new LinkedList<BSTNode>();

        levelNodes.add(root);

        while(!levelNodes.isEmpty()){
            int size = levelNodes.size();
            for(int i = 0; i < size; i++){

                BSTNode n  = levelNodes.poll();
                levelList.add(n.val);

                if(n.left != null){
                    levelNodes.add(n.left);
                }
                if(n.right != null){
                    levelNodes.add(n.right);
                }
            }
            topList.add(levelList);
            levelList = new ArrayList<T>();
           
        }

        return topList;
    }
    


    // public static void main(String[] args) {

     


    // }


}
