package com.ds.ee;

public class Polygon {

   private String name;
   private int numSides;

   public Polygon(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
   }

   public boolean isPolygon(){
       if(this.numSides < 3)
           return false;
       return true;
   }

}
