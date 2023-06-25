package com.ds.ee;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main{
    public static void main(String[] args) {
       
//
//       Polygon t = new Triangle(5,3,2,2);
//       System.out.println(t.area());
//       System.out.println(t.perimeter());

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("H yyyy.MM.dd 'at' hh:mm:ss a zzz");
        //System.out.println(sdf.format(now));
        System.out.println(now);

    }

}