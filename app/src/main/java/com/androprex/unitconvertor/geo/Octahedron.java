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
public class Octahedron {
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
 a=Math.sqrt(ar/3.46410162);
 v=0.471404521*pow(a,3);
 
 String res="Calculating Side (a) via Using Area \n Side(a)= sqrt(ar/3.46410162)\n Side (a)="+a+"\nCalculating Voloume via Using Area \n Volume= 0.471404521*pow(a,3)\n Volume="+v;
 
 return res;
 
 }
  public String getResultByv(double v)
    {
    a=Math.pow(v/0.471404521,0.333);
    ar= 3.46410162*pow(a,2);
    
    String res= "Calculating Side (a) via Using Volume \n Side(a)=pow(v/0.471404521,1/3)\n Side (a)="+a+"\n Calculating Area via Using Volume \n Area= 3.46410162*pow(a,2)\n Area="+ar;
    return res;
    
    }
  public String getResultBya(double a)
    {
    v=0.471404521*pow(a,3);
    ar= 3.46410162*pow(a,2);
    
    String res= "Calculating Area via Using Side (a) \n Area= 3.46410162*pow(a,2) \n Area="+ar+"\n Calculating Volume via Using Side(a)\n Volume= 0.471404521*pow(a,3)\n Volume="+v;
    return res;
    
    }
}
