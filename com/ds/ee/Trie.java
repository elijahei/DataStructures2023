package com.ds.ee;

import java.util.HashMap;

/*.
 * File: Trie.java
 * Author: Elijah Einstein <einsteine98@gmail.com>
 * 
 */


// TODO: debug -- checkString() returns false in some cases when its supposed to return true, example: insert star and starbucks, checkString("starbucks") is false

public class Trie {

   
    class TrieNode{
       
        HashMap<Character,TrieNode> map; // contains current character, and a TrieNode to the next character in string
        boolean isValidString; // is true if string till here is valid
        String s; // string till this point
        TrieNode(){
            map = new HashMap<Character,TrieNode>();
            isValidString = false;
        }
    }

    TrieNode node; 

    public Trie(){
        this.node = new TrieNode();
        this.node.isValidString = false;
    }


    // inserts s into this Trie
    public void insertString(String s){
        if(s.length() == 0)
            return;

        TrieNode newNode = new TrieNode();
        this.node.map.put(s.charAt(0), newNode);


        for(int i = 1; i < s.length(); i++){
            TrieNode nNode = new TrieNode();
            newNode.s = s.substring(0, i);
            newNode.map.put(s.charAt(i), nNode);
            newNode = nNode;
           
        }
       
        newNode.isValidString = true;
        newNode.s = s.substring(0, s.length());
        System.out.println(newNode.s);
        System.out.println("----------------------------------------------");
       
    }


    // returns true if s is in the Trie, false otherwise 
    public boolean checkString(String s){

        if(s.length() == 0){
            return false;
        }


       return checkStringHelper(s, this.node, 0);
    }

    //helper method called by insertString()
    private boolean checkStringHelper(String s, TrieNode n, int index){

        TrieNode nn = null;
        if(index == s.length()-1){
            nn = n.map.get(s.charAt(index));
            if (nn != null && nn.s.equals(s)){
                return true;
            }
            else{
                return false;
            }
        }


        nn = n.map.get(s.charAt(index));
       
       

        if(nn == null){
            
            return false;
        }

        index += 1;
        return checkStringHelper(s, nn, index);
    }


    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertString("hello");
        t.insertString("hell");
        t.insertString("samy");
        t.insertString("samosa");
        t.insertString("starbucks");
        t.insertString("star");
        

        System.out.println(t.checkString("star"));
    }
    
}
