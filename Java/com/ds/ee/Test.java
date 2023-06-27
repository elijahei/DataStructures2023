package com.ds.ee;


import jdk.jshell.spi.ExecutionControlProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Scanner;



class Parent{

    public static void m1(){
        System.out.println("parent");
    }
}


class Child extends Parent{


    public static void m1() {
        System.out.println("child");
    }


}

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 10; i++){
            System.out.println("child thread");
        }
    }

}


public class Test{

    public static void main(String[] args)  {


        MyThread my = new MyThread();
        my.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        //System.out.println(Thread.currentThread().getName());
        my.start();

    }

}


