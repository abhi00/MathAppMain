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
public class Heptagon {

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
	
a=Math.sqrt(ar/3.633912444);
peri=7*a;

String out ="Calculating side via Area: a =sqrt(ar/3.633912444)\n a = "+a+"\n Calculating  Perimeter  via Area : peri=7*a\n peri="+peri;


return out;

    
    
    
    
}

         public String  getResultByPeri(double peri)
{
	
a=peri/7;
ar=3.633912444*Math.pow(a, 2);

String out ="Calculating side via Peri: a =peri/7 \n a = "+a+"\n Calculating Area via Perimeter  : ar=3.633912444*pow(a,2)\n ar="+ar;


return out;

    
    
    
    
}

                  public String  getResultBySide(double a)
{
	
peri=7*a;
ar=3.633912444*Math.pow(a, 2);

String out ="Calculating peri via side: peri =7*a \n peri = "+peri+"\n Calculating Area via Side  : ar=3.633912444*pow(a,2)\n ar="+ar;


return out;

    
    
    
    
}

                  
    
        
        
        }
