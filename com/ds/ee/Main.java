package com.ds.ee;


public class Main{
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertString("starbucks");
        t.insertString("star");
        t.insertString("starring");
        t.insertString("static");
        t.insertString("elijah");
        t.insertString("starrer");
        t.insertString("statistics");
        t.insertString("stamp");
        t.insertString("stammer");
        t.insertString("starsucks");
        t.insertString("camera");
        t.insertString("chicago");

        // System.out.println(t.checkString("starbucks"));
        // System.out.println(t.checkString("star"));
        // System.out.println(t.checkString("static"));
        // System.out.println(t.checkString("stammer"));
        // System.out.println(t.checkString("stammer"));
        // System.out.println(t.checkString("stamp"));
        // System.out.println(t.checkString("starring"));
        System.out.println(t.numStrings);
        System.out.println(t.getAllStrings());
        System.out.println(t.getAllStrings().size());
        System.out.println(t.numStrings);
        System.out.println( t.checkString("chicago"));
       

    }

}