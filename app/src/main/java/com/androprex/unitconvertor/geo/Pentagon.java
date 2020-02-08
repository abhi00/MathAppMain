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
public class Pentagon {
    
        private double ar,peri,a;

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
	
a=Math.sqrt(ar/1.720477401);
peri=5*a;

String out ="Calculating side via Area: a =sqrt(ar/1.720477401)\n a = "+a+"\n Calculating  Perimeter  via Area : peri=5*a\n peri="+peri;


return out;

    
    
    
    
}

         public String  getResultByPeri(double peri)
{
	
a=peri/5;
ar=1.720477401*Math.pow(a, 2);

String out ="Calculating side via Peri: a =peri/5 \n a = "+a+"\n Calculating Area via Perimeter  : ar=1.720477401*pow(a,2)\n ar="+ar;


return out;

    
    
    
    
}

                  public String  getResultBySide(double a)
{
	
peri=5*a;
ar=1.720477401*Math.pow(a, 2);

String out ="Calculating peri via side: peri =5*a \n peri = "+peri+"\n Calculating Area via Side  : ar=1.720477401*pow(a,2)\n ar="+ar;


return out;

    
    
    
    
}

    
    
    
    
    
    
    
}
