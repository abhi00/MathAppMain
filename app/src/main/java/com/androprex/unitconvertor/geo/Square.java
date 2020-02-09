/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.androprex.unitconvertor.geo;

/**
 *
 * @author BABLU SHARMA
 */
public class Square {

    private String Ar;

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
    

    private double ar,peri,a;

    public String getResultByArea(double ar) 
    {
      a=Math.sqrt(ar);
      peri=4*a;
      
      String out = "for calculating Perimeter via Area: \n"
              +" a= sqrt(ar)\n"+a+"\n calculating perimeter via area P= 4*a "+ peri;
      return out;    
     
    }
    
     public String getResultByPerimeter(double peri)
     {
     a=peri/4;
     ar= Math.pow(a, 2);
     
     String res =  "for calculating Area via Perimeter: \n"
              +" a= P/4 \n"+a+"\n calculating side via perimeter A= pow(a,2) "+ Ar;
     return res;
     }


    public String getResultBySide(double a)
    {
        ar=Math.pow(a,2);
        peri=4*a;
        String out = "for calculating Area via side(a): \n"
                +" ar=pow(a,2)\n"+ar+"\n calculating perimeter via side(a) P= 4*a "+ peri;
        return out;

    }




}
    

