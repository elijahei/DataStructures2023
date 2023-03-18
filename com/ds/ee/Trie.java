package com.ds.ee;

import java.util.HashMap;

/*.
 * File: Trie.java
 * Author: Elijah Einstein <einsteine98@gmail.com>
 * 
 */



class Trie {

   
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

        int index = 0;
        TrieNode temp = this.node;
        while(index < s.length() && temp.map.get(s.charAt(index)) != null){ // add in this path
           
            temp = temp.map.get(s.charAt(index));
            index += 1;
           
        }

        // add remaining string from here -- new nodes from here
        while(index < s.length()){
            TrieNode newNode = new TrieNode();
            temp.map.put(s.charAt(index), newNode);
            temp = newNode; 
            index += 1;
        }

        // string added
        temp.isValidString = true;
        temp.s = s.substring(0, s.length());

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
            if (nn != null && nn.isValidString){
                return true;
            }
            else{
                return false;
            }
        }


        nn = n.map.get(s.charAt(index));
       
        if(nn != null){
           // System.out.println(n.s);
        }

        if(nn == null){

            //System.out.println(nn.s);
            
            return false;
        }

        index += 1;
        return checkStringHelper(s, nn, index);
    }


    // public static void main(String[] args) {
    //     Trie t = new Trie();
    //     t.insertString("hello");
    //     // t.insertString("hell");
    //     // t.insertString("samy");
    //     // t.insertString("samosa");
    //     t.insertString("star");
    //     t.insertString("starbucks");
    //     t.insertString("try");
    //     t.insertString("trying");
    //     t.insertString("tryinggg");
       
        

    //     System.out.println(t.checkString("starb"));
    //     System.out.println(t.checkString("try"));
    //     System.out.println(t.checkString("trying"));
    //     System.out.println(t.checkString("tryingggg"));

    // }
    
}
