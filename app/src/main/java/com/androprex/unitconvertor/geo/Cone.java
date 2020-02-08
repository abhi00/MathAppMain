/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.androprex.unitconvertor.geo;

import static java.lang.Math.pow;

/**
 *
 * @author BABLU SHARMA
 */
public class Cone {

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    private double ar,r,h,v,d;
  public String getArea(double r, double h)
    {
    ar= Math.PI*r*r+Math.PI*r*h;
    
    String res= "Calculating the Area via Radius(r)and Height (h) Area = {U+03C0}*r*r+{U+03C0}*r*h \n Area ="+ar;
    
    return res;
    }
  public String getVolume(double r, double h)
    {
   
    v= Math.PI*r*r*h/3;
    
    String res= "Calculating the Area via Radius(r)and Height (h) Volume = {u+03C0}*r*r*h/3 Volume ="+v;
    
    return res;
    }
 
     public String getResultByvh(double v, double h)
    {
    r= Math.sqrt(3*v/(Math.PI*h));
   
    String res= "Calculating the Area via Radius(r)and Height (h) Radius = sqrt(3*v/(U+03C0*h))\n Radius ="+r;
    
    return res;
    }
  
   public String getResultByr(double r)
    {
    d=2*r;
   
    String res= "Calculating the Diameter via Radius(r) Diameter = 2*r \n Diameter ="+d;
    
    return res;
    }
   
   public String getResultByvr(double v, double r)
    {
    h= 3*v/(Math.PI*pow(r,2));
   
    String res= "Calculating the Height via Radius(r)and Volume (v) Height = 3*v/(U+03C0*pow(r,2))\n Height ="+h;
    
    return res;
    }
  
  
  
  
}
