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
        this.node.isValidString = false;
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

        if(s.length() == 0){
            return false;
        }

        
        

       return checkStringHelper(s, this.node, 0);
    }

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


    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertString("hello");
        t.insertString("hell");
        t.insertString("samy");
        t.insertString("samosa");
        //boolean flag = t.checkString("sammy");

        System.out.println(t.checkString("samy"));
    }
    
}
