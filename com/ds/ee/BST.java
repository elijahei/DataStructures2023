package com.ds.ee;

import java.util.List;
import java.util.ArrayList;
import java.io.*;


/*
 * A Binary Search Tree that stores ints, this tree does not store duplicates
 */

 public class BST implements java.io.Serializable{

    class BSTNode implements java.io.Serializable{ // inner class
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
            this.root = new BSTNode(val);
            size += 1;
            return true; 
        }
       
        return insertInternal(val, this.root);
    }

    private boolean insertInternal(int val, BSTNode root){
        
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
       
        
        // BST b = new BST(5);
        // b.insert(10);
        // b.insert(8);
        // b.insert(5);
        // b.insert(6);

        // b.insert(9);
        // b.insert(56);
        // b.insert(45);
        // b.insert(60);

        
        // try {
        //     FileOutputStream fileOut =
        //     new FileOutputStream("/tmp/BST.ser");
        //     ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //     out.writeObject(b);
        //     out.close();
        //     fileOut.close();
        //     System.out.printf("Serialized data is saved in /tmp/BST.ser");
        //  } catch (IOException i) {
        //     i.printStackTrace();
        //  }

        BST bs = null;

        try {
            FileInputStream fileIn = new FileInputStream("/tmp/BST.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            bs = (BST) in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException i) {
            i.printStackTrace();
            return;
         } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
         }

         List<Integer> il = bs.inorder();

         System.out.println("size is " + bs.size());
         System.out.println(il);


    }


}
