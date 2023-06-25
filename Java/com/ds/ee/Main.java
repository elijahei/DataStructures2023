package com.ds.ee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;


public class Main{
    public static void main(String[] args) {

        try{
            ArrayList<String> lis = new ArrayList<String>(Files.readAllLines(Paths.get("random.txt")));
            System.out.println(lis);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

    }

}