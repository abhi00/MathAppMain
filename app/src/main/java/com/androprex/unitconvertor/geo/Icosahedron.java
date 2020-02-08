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
public class Icosahedron {

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
    public String getResultByar(double ar)
    {
    a= Math.sqrt(ar/8.66025404);
    v= pow(3,1/4)*pow(a,3/2)*(5+Math.sqrt(45))/180;
    
    String res= "Calculating Side (a) via Using Area \n Side(a)= sqrt(ar/8.66025404)\n Side (a)="+a+"\nCalculating Voloume via Using Area \n Volume=  pow(3,1/4)*pow(a,3/2)*(5+sqrt(45))/180\n Volume="+v;
    return res;
    
    }
     public String getResultByv(double v)
    {
    a= Math.pow(9*(v/5)-3*Math.sqrt(5)*v/5,1/3);
    ar= 8.66025404*pow(a,2);
    
    String res= "Calculating Side (a) via Using Volume \n Side(a)= pow(v/2.18169449,1/3)\n Side (a)="+a+"\nCalculating Area via Using Volume \n Volume= 8.66025404*pow(a,2)\n Volume="+v;
    return res;
    
    }
     public String getResultBya(double a)
    {
    v=2.18169499*pow(a,3);
    ar= 8.66025404*pow(a,2);
    
    String res= "Calculating Area via Using Side (a) \n Area= 8.66025404*pow(a,2) \n Area="+ar+"\nCalculating Volume via Using Side(a)\n Volume= 2.18169499*pow(a,3)\n Volume="+v;
    return res;
    
    }
            
}
