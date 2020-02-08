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
public class Cube {
    private double ar,v,a;

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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public String getResultByar(double ar)
    {
    a = Math.sqrt(ar/6);
    v = pow(a,3);
    
    String res = "Calculating Side(a) via Using Area(a)\n Side (a)= sqrt(a\6)\n Side(a)="+a+"\n Calculating Volume(v) via Using Area\n Volume (v)= pow(a,3\n Volume="+v;

     return res;
   
    }
      public String getResultByv(double v)
    {
     a = pow(v,(1/3));
    ar = 6*(pow(a,2));
    
    
    String res = "Calculating Area via Using Volume\n Area= 6*pow(a,2) \n Area="+ar+"\n Calculating Side(a) via Using Volume\n Side(a)=pow(v,1/3) ="+a;

     return res;
    }
  public String getResultBya(double a)
  {
    ar = 6*(pow(a,2));
    v= pow(a,3);
    
    
    String res = "Calculating Area via Using Side (a)\n Area= 6*pow(a,2) \n Area="+ar+"\n Calculating Volume via Using Side(a)\n Volume=pow(a,3) ="+v;

     return res;
    }
}

