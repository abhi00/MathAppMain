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
public class IsoscelesTriangle {
    
    private double ar,peri,a,b,h,alpha,beta;

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

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }
    
    public String getAreaBybh(double b,double h)
    {
    ar=(b*h)/2;
    
        String out="Calculating area via base(b) and height(h): ar=(b*h)/2 \n ar="+ar;
        return out;

    
    }
    
     public String getPeriByab(double a, double b)
     
    {
        
        
    
    
    peri=2*a+b;
    
    String out="Calculating peri via side(a) and base(b):peri=2*a+b\n perimeter="+peri;          
    
        return out;
        
    }
    
    public String getSideBybh(double b,double h)
    {
    
    a=Math.sqrt(Math.pow(b/2, 2)+Math.pow(h, 2));
    
        String out="Calculating side(a) via base(b) and height(h) :side(a)=sqrt(pow(b/2,2)+pow(h,2))\n side(a)="+a;          

    return out;
    }
    
   public String getBaseByah(double a,double h)
    {
    
    b=2*Math.sqrt(Math.pow(a, 2)-Math.pow(h, 2));
    
        String out="Calculating base(b) via side(a) and height(h) :base(b)=2*sqrt(pow(a,2)-pow(h,2))\n base(b)="+b;          

    return out;
    }
   
   public String getHeightByab(double a,double b)
    {
    
    h=Math.sqrt(Math.pow(a, 2)-Math.pow(b/2, 2));
    
        String out="Calculating height(h) via side(a) and base(b)  :height(h) =sqrt(pow(a,2)-pow(b/2,2))\n height(h) ="+h;          

    return out;
    }
   
   public String getAngleByah(double a,double h)
    {
    
    alpha=Math.asin(h/a);
    String out="Calculating angle alpha via side(a) and height(h): alpha=asin(h/a)\n alpha="+alpha;
    

    return out;
    }
   
   public String getAngleByara(double ar,double a)
    {
    //beta=a*Math.sin(2*ar/Math.pow(a, 2));
    beta=Math.asin(2*ar/Math.pow(a, 2));
    String out="Calculating angle alpha via side(a) and height(h): alpha=asin(h/a)\n beta="+beta;
    

    return out;
    }
           
    
    
    
}
