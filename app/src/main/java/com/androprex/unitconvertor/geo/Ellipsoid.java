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
public class Ellipsoid {
    private double ar,v,a,b,c;
    public String getResultByabc(double a,double b,double c)
    {
    v= 4*Math.PI*a*b*c/3;
   ar= 4*Math.PI*Math.pow((Math.pow(a*b,1.6)+(Math.pow(a*c,1.6))+(Math.pow(b*c,1.6)))/3,1/1.6);
    
    String res = "Calculating Volume via Using Side(a),Side(b) and Side(c) \n Volume = 4*{U+03C0}*a*b*c/3 \n Volume = "+v+"Calculating Area via Using Side(a),Side(b) and Side(c) \n Area = 4*{U+03C0}*Math.pow((pow(a*b,1.6)+(pow(a*c,1.6))+(pow(b*c,1.6)))/3,1/1.6) \n Area = "+ar;
    
    return res;
    }
    
     public String getResultByvba(double a,double b,double v)
    {
    c=3*(v/4*Math.PI*a*b);
    ar= 4*Math.PI*Math.pow((Math.pow(a*b,1.6)+(Math.pow(a*c,1.6))+(Math.pow(b*c,1.6)))/3,1/1.6);
    
   
    
    String res = "Calculating Area via Using Side(a),Side(b) and Side(c) \n Area = 4*{U+03C0}*Math.pow((pow(a*b,1.6)+(pow(a*c,1.6))+(pow(b*c,1.6)))/3,1/1.6) \n Area = "+ar+"Calculating Side(c)via Using Side(a),Side(b)and Volume\n Side(c)=3*(v/4*{U+03C0}*a*b)\n Side(c =)"+c;
    
    return res;
    }
}
