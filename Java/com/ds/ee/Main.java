package com.ds.ee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        try{
            File f = new File("com/ds/ee/random.txt");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            //System.out.println(f.getAbsolutePath());
            File newFile = new File("bullshit.txt");

            myReader.close();
        }
        catch(Exception fne){
            fne.printStackTrace();
        }




    }


  

}