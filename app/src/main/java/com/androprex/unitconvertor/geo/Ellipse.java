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
public class Ellipse {
    
    
    private double ar,p,q;

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }
    
    
    public String getResultByadp(double ar,double p)
    {
    q=ar/(Math.PI*p);
    
     String out="Calculating diameter(q) via diameter(p) and Area: q=ar/(PI*p)\n q="+q;
    
    return out;
    
    }
            
             public String getResultByadq(double ar,double q)
    {
    p=ar/(Math.PI*q);
    
     String out="Calculating diameter(p) via diameter(q) and Area: p=ar/(PI*q)\n p="+p;
    
    return out;
    
    }
             
                      public String getResultBypq(double p,double q)
    {
    ar=Math.PI*p*q;
    
     String out="Calculating area(ar) via diameter(p) and diameter(q): ar=PI*p*q\n ar="+ar;
    
    return out;
    
    }
             
            
            
    
}
