package com.ds.ee;

import java.util.HashMap;

public class Trie {



    class TrieNode{
       
        HashMap<Character,TrieNode> map;
        boolean isValidString;
        TrieNode(){
            map = new HashMap<Character,TrieNode>();
            isValidString = false;
        }
    }

    TrieNode node; 

    public Trie(){
        this.node = new TrieNode();
        // this.node.map = new HashMap<Character,TrieNode>();
        // this.node.isValidString = false;
        this.node.map.put('$', null);
    }

    public void insertString(String s){
        if(s.length() == 0)
            return;
        TrieNode newNode = new TrieNode();

        this.node.map.put(s.charAt(0), newNode);

        for(int i = 1; i < s.length(); i++){
            TrieNode nNode = new TrieNode();
            newNode.map.put(s.charAt(i), nNode);
            newNode = nNode;
        }
        newNode.map.put('$', null);
        newNode.isValidString = true;
    }

    public boolean checkString(String s){
        //TODO: Implement this
       return false;
    }


    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertString("hello");
    }
    
}
