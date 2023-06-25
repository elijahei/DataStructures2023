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
        if (this.price < 50000.0)
            return true;
        else
            return false;
    }

}

public class Test{


    public static void main(String[] args) {
        Vehicle v1 = new Car("Chevy", 350, "Blazer", 45000.0);
        //System.out.println(c1);
        v1.average();
       // v1.isWorthIt();

        //Car c2 = new Vehicle("Ford", 450);
    }

}


