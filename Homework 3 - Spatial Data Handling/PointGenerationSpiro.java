 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;
 
 
 
 class PointGenerationSpiro
     {
     
     public static void main(String[] args)
         {
      
         
         ArrayList<Double> list1 = new ArrayList<Double>();
         ArrayList<Double> list2 = new ArrayList<Double>();
     	double R =8.00;
     	double r=1.00;
     	double a=4.00;
     	
         double xpoint,ypoint,longitude,latitude;
         double lo = -118.289155;
         double la = 34.021241;
         double nRev = 16;
         list1.add(lo);
         list2.add(la+0.001*(R+r-a));
         
         for(double t = 0.00; t<= (Math.PI*nRev) ;t+=0.02)
             {
              xpoint = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
              ypoint = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
              longitude = (lo + 0.0001*ypoint);
              latitude = (la + 0.0001*xpoint);
             list1.add(longitude);
             list2.add(latitude);
             
         }
         for(int i=0;i<list1.size();i++)
         	System.out.println(list1.get(i)+","+list2.get(i));
         
     
     }
 
 }