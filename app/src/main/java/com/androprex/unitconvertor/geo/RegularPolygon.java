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
public class RegularPolygon {
    
    private double ar,peri,a,alpha,n;

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

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
    
    
    
    public String getAreaByan(double a, double n)
     
    {
        
        
    
    ar=n*Math.pow(a, 2)*Math.cos(Math.PI/n)/(4*Math.sin(Math.PI/n));
    
    
    String out="Calculating area via side and no. of edge : ar=n*pow(a,2)*cos({U+03C0}/n)/(4*sin({U+03C0}/n))\n ar="+ar;          
    
        return out;
        
    }
    
    
     public String getPeriByan(double a, double n)
     
    {
        
        
    
    
    peri=n*a;
    
    String out="Calculating peri via side and no. of edge:peri=n*a\n perimeter="+peri;          
    
        return out;
        
    }
    
    
    public String getAngleBypa(double peri,double a)
    {
          alpha=(peri/a-2)*Math.PI/(peri/a);
      
    String out="Calculating angle alpha  via peri and side  : alpha=(peri/a-2)*PI/(peri/a) \n alpha="+alpha+"radian";
        return out;
        
    
    }
    
    
    public String getNumberOfEdgeBypa(double peri,double a)
    {
     
        n=peri/a;
    String out="Calculating no. of edge via peri and side  : n=peri/a \n no.of edge="+n;
        return out;
        
    
    }
    
    
    
    public String getSideBypn(double peri,double n)
    {
    
        a=peri/n;
    String out="Calculating side via peri and no.of edge: a=peri/n \n Side="+a;
        
    return out;
    }
    
  
    
    
}
