package com.ds.ee;


public class Main{
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertString("starbucks");
        t.insertString("star");
        t.insertString("starring");
        t.insertString("static");
        t.insertString("starrer");
        t.insertString("statistics");
        t.insertString("stamp");
        t.insertString("stammer");

        System.out.println(t.checkString("elijah"));

    }

}