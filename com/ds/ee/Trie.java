package com.ds.ee;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

/*.
 * File: Trie.java
 * Author: Elijah Einstein <einsteine98@gmail.com>
 * 
 */



class Trie {

   
    class TrieNode{
       
        HashMap<Character,TrieNode> map; // contains current character, and a TrieNode to the next character in string
        boolean isValidString; // is true if string till here is valid
        String str; // string till this point
        
        TrieNode(){
            map = new HashMap<Character,TrieNode>();
            isValidString = false;
        }
    }

    TrieNode node; 
    int numStrings;

    public Trie(){
        this.node = new TrieNode();
        this.node.isValidString = false;
        numStrings = 0;
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
        temp.str = new String(s);
        this.numStrings += 1;
       
        
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

        if(nn == null){            
            return false;
        }

        index += 1;
        return checkStringHelper(s, nn, index);
    }



    // returns a list of all strings in this trie
    public List<String> getAllStrings(){
        return getAllStringsHelper(this.node, new ArrayList<String>());
    }

    private List<String> getAllStringsHelper(TrieNode currNode, List<String> l){

        Set<Character> s = currNode.map.keySet();
      
        for(Character c : s){
            TrieNode n = currNode.map.get(c);
            l = getAllStringsHelper(n, l);
            if(n.str != null){
                l.add(n.str);
            }
        }
        return l;
    }
    
}
