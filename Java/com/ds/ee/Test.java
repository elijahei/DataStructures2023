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

class MyThread implements Runnable{

    @Override
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }

    }

}


public class Test{

    public static void main(String[] args)  throws Exception {


        Runnable myRunnable = new MyThread();
        Thread my = new Thread(myRunnable);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        my.setName("Random name!");
        //System.out.println(Thread.currentThread().getName());
        my.start();
        for(int i = 0; i < 10; i++){
            my.join();
            System.out.println("main thread");
        }

    }

}


