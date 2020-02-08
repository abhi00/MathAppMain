/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.androprex.unitconvertor.geo;

/**
 *
 * @author ritesh pathak
 */
public class EquilateralTriangl {
    
    
    private double ar, peri,a, h ;

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
    
      public String  getResultByArea(double ar)
{
	
a=Math.sqrt(ar*4/Math.sqrt(3));
h=a*Math.sqrt(3)/2;
peri=3*a;

String out ="Calculating side via Area: a =sqrt(ar*4/sqrt(3)) \n a = "+a+"\n Calculating height via Area: h = a*sqrt(3)/2 \n h = "+h+" \nCalculating  Perimeter  via Area : peri=3*a\n peri="+peri;


return out;

    
    
    
    
}
          public String  getResultByPeri(double peri)
{
	
a=peri/3;
ar=Math.pow(a, 2)*Math.sqrt(3)/4;
h=a*Math.sqrt(3)/2;


String out ="Calculating side via Peri: a =peri/3 \n a = "+a+"\n Calculating height via Peri: h = a*sqrt(3)/2 \n h = "+h+" \nCalculating Area via Peri : ar=pow(a,2)*sqrt(3)/4 \n ar="+ar;


return out;

      
} 
      
        public String  getResultBySide(double a)
{

    h=a*Math.sqrt(3)/2;
   ar=a*h/2;
   peri=3*a;



String out ="Calculating Peri via side: peri =3*a \n peri = "+peri+"\n Calculating height via Side: h = a*sqrt(3)/2 \n h = "+h+" \nCalculating Area via Side : ar=a*h/2\n ar="+ar;


return out;

      
} 
      
        
        
        public String  getResultByHeight(double h)
{

    a=h*2/Math.sqrt(3);
   ar=a*h/2;
   peri=3*a;



String out ="Calculating side via height : a =h*2/sqrt(3) \n a = "+a+"\n Calculating peri via Height: peri = 3*a \n peri = "+peri+" \nCalculating Area via Height : ar=a*h/2\n ar="+ar;


return out;

      
} 
          
}