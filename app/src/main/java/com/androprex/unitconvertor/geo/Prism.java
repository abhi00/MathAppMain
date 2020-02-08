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
public class Prism {

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    private double ar,v,l,w,h;
    public String getArea(double l,double w,double h)
    {
    ar= 2*(w*l+h*l+h*w);
    
    String res= "Calculating Area via Length,Width and Height \n Area= 2(wl+hl+hw)\n Area="+ar;
    return res;
    
    }
     public String getVolume(double l,double w,double h)
    {
    v= w*h*l;
    
    String res= "Calculating Volume via Length,Width and Height \n Volume= w*h*l\n Volume="+v;
    return res;
    
    }
      public String getwidth(double l,double v,double h)
    {
    w= v/(h*l);
    
    String res= "Calculating Width via Length,Volume and Height \n Width= v/h*l\n Width="+w;
    return res;
    
    }
       public String getLength(double w,double v,double h)
    {
    l= v/(h*w);
     
    String res= "Calculating Length via Width,Volume and Height \n Length= v/h*w\n Length="+l;
    return res;
    
    }
       public String getHeight(double w,double v,double l)
    {
    h= v/(l*w);
     
    String res= "Calculating Height via Width,Volume and Length \n Height= v/l*w\n Height="+h ;
    return res;
    
    }
}
