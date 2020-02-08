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
public class Dodecahedron {

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
    @SuppressWarnings("UnusedAssignment")
    public String getResultByar( double ar)
    {
    a= Math.sqrt(ar/20.645728807);
    v= (15+7*Math.sqrt(5))/4*pow(a,3);
    
    String res= "Calculating Side(a) via Using Area(a)\n Side (a)= sqrt(Area/20.645728807)\n Side(a)="+a+"\n Calculating Volume(v) via Using Area\n Volume (v)=7.6631189606*pow(a,3)\n Volume="+v;
    
    return res;
    
    }
    public String getResultBya( double a)
    {
    v= 7.6631189606*pow(a,3);
    ar= 20.645728807*pow(a,2);
    
    String res= "Calculating Area via Using Side(a)\n Volume= 20.645728807*pow(a,2)\n Area="+ar+"\n Calculating Area via Using Side(a)\n Area=7.6631189606*pow(a,3)\n Volume="+v;
    
    return res;
    
    }
     public String getResultByv( double v)
    {
    a=Math.pow(v/7.6631189606,0.333);
    ar= 20.645728807*pow(a,2);
    
    
    String res= "Calculating Area via Using Side(a)\n Area= 20.645728807*pow(a,2)\n Area="+ar+"\n Calculating Side (a) via Using Volume \n Side (a)=pow(v/7.6631189606,1/3\n Side(a)="+a;
    
    return res;
    
    }
}
