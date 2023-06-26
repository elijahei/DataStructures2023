package com.ds.ee;





 class Vehicle {
    protected String brand;
    protected int horsePower;

    Vehicle(String brand, int horsePower) {
        //System.out.println("initializing vehicle members");
        this.brand = brand;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        //System.out.println("still toString of vehicle!");
        return "Brand:" + this.brand + ", HP:" + Integer.toString(horsePower);
    }

    public double average(){
        return 50.0;
    }

}

class Car extends Vehicle {

    private String name;
    private double price;

    Car(String brand, int horsePower, String name, double price) {
        super(brand, horsePower);
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Brand:" + this.brand + ", Name:" + this.name + ", Price:$" + this.price + ", HP:" + this.horsePower;
    }

    public double average(){
        return this.price/2;
    }

    public boolean isWorthIt(){
        return this.price < 50000.0;
    }

}

interface Animal{
     public void animalSound();
     public void run();
}

abstract class Dog implements Animal{

    @Override
    public void animalSound() {
        System.out.println("boo");
    }

}

class Pluto extends Dog{

    @Override
    public void run() {
        System.out.println("fast!");
    }
}


public class Test{


    public static void main(String[] args) {

        Animal ani = new Pluto();
        ani.run();


    }

}


