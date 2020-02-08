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
public class Decagon {
    
    
     private double ar,peri,a,b,c;


  
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

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



 public String  getResultByArea(double ar)
{

    b=Math.sqrt(2*(ar/5));
  
    c=  Math.pow(Math.sqrt(20)+5, 1/4);     
    
    a=b/c;
//a=Math.sqrt(ar/Math.cos(Math.PI/10)*2/5);
peri=10*a;

String out ="Calculating side via Area: a =(sqrt(2*ar/5))/(pow(sqrt(20)+5,1/4))\n a = "+a+"\n Calculating  Perimeter  via Area : peri=10*a\n peri="+peri;


return out;

    
    
    
    
}

         public String  getResultByPeri(double peri)
{
	
a=peri/10;
ar=(5/2)*Math.pow(a,2)*Math.cos(Math.PI/10);

String out ="Calculating side via Peri: a =peri/10 \n a = "+a+"\n Calculating Area via Perimeter  : ar=1.720477401*pow(a,2)\n ar="+ar;


return out;

    
    
    
    
}

 public String  getResultBySide(double a)
{
	
peri=10*a;
ar=(5/2)*Math.pow(a,2)*Math.cos(Math.PI/10);

String out ="Calculating peri via side: peri =10*a \n peri = "+peri+"\n Calculating Area via Side  : ar=5/2*pow(a,2)*cos(PI/10)\n ar="+ar;


return out;

    
    
    
    
}

    
    
    
    
    
    
    
    
    
}
