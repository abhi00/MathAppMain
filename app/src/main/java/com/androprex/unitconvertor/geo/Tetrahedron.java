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
public class Tetrahedron {
    

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
 private double ar,v,a;
 public String getResultByArea(double ar)
 {
 a= Math.sqrt(ar/1.7320508075);
 v= 0.117851130197*pow(a,3);
 String res= "Calculating Side(a) via Using Area\n Side(a)=sqrt(ar/1.7320508075)\n Side(a)="+a+"\nCalculating Volume via Using Area\n Volume= 0.117851130197*pow(a,3)\n Volume="+v;
 return res;
 
 }
 public String getResultByVolume(double v)
 {
 a= Math.pow(v/0.117851130197,0.333);
 ar= 1.7320508075*Math.pow(a,2);
 String res= "Calculating Side(a) via Using Volume\n Side(a)=pow(v/0.117851130197,1/3)\n Side(a)="+a+"\nCalculating Area via Using Volume\n Area= 1.7320508075*pow(a,2)\n Area="+ar;
 return res;
 
 }
 public String getResultBySide(double a)
 {
 v= 0.117851130197*Math.pow(a,3);
 ar= 1.7320508075*Math.pow(a,2);
 String res= "Calculating Volume via Using Side\n Volume= 0.117851130197*Math.pow(a,3)\n Volume="+v+"\nCalculating Area via Using Volume\n Area= 1.7320508075*pow(a,2)\n Area="+ar;
 return res;
 
 }
}
