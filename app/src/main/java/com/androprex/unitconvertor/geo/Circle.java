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
public class Circle {
    
  private double ar, r,d,cir;

    public double getA() {
        return ar;
    }

    public void setA(double ar) {
        this.ar = ar;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getC() {
        return cir;
    }

    public void setC(double c) {
        this.cir = c;
    }
  
    public String  getResultByArea(double ar)
{
	

	r = Math.sqrt(ar/Math.PI);

     d = r*2;

     cir = Math.PI*d;

String out ="Calculating radius via Area: r =sqrt(A/{U+03C0}) \n r = "+r+"\n Calculating Diameter via Area: d = r*2 \n d = "+d+" \nCalculating  Circumference via Area : c={U+03C0}*d\n c="+cir;


return out;
}
   public String  getResultByCircum(double c)
   {
    d=c/Math.PI;
    r=d/2;
    ar=Math.PI*r*r;
    
    String out="Calculating radius via circum: r =d/2 \n r = "+r+"\n Calculating Diameter via circum: d =c/{U+03C0}  \n d = "+d+" \n Calculatin Area via circum: a={U+03C0}*r*r\n a= "+ar;
    
    
    return out;
    
    
   }
   
   public String  getResultByDia(double d)
   {
    cir=Math.PI*d;   
    r=d/2;
    ar=Math.PI*r*r;
    
    String out="Calculating Radius via Dia: r =d/2 \n r = "+r+"\n Calculating Circumference via Dia c={U+03C0}*d  \n c = "+cir+" \n Calculating  Area via Dia:a={U+03C0}*r*r \n a= "+ar;


return out;

    
   
    
    
   }
   
 public String  getResultByRad(double r)
   {
       d=r*2;
    cir=Math.PI*d;   
    
    ar=Math.PI*r*r;
    
    String out="Calculating Dia via Rad: d=r*2 \n d = "+d+"\n Calculating Circumference via Rad: c ={U+03C0}d  \n c = "+cir+" \n Calculating  Area via Rad: a={U+03C0}*r*r \n a= "+ar;


return out;
   
   
   
   
   
   }
 
 
 
}
