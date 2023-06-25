package com.ds.ee;

 abstract class Polygon {

   private String name;
   private int numSides;

   public Polygon(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
   }

   public abstract double area();
   public abstract double perimeter();


}

class Triangle extends Polygon{


     private double breadth, height,side1,side2;

     Triangle(double breadth, double height, double side1, double side2){
         super("Triangle", 3);
         this.breadth = breadth;
         this.height = height;
         this.side1 = side1;
         this.side2 = side2;

     }

     public double area(){
         return Math.ceil(0.5 * this.breadth * this.height);
     }

    @Override
    public double perimeter() {
        return this.breadth + this.side1 + this.side2;
    }
}
