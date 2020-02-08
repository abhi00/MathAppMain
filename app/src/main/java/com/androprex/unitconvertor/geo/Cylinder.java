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
public class Cylinder {
private double ar,v,r,d,h;
public String getArea(double h,double r)
{
ar= 2*Math.PI*r*(r+h);

String res = "Calculating Area via using Height And Radius\n Area = 2*{U+03C0}*r*(h+r)\n Area = "+ar;
return  res;

}
public String getVolume(double h,double r)
{
v= Math.PI*pow(r,2)*h;

String res =  "Calculating Volume via using Height And Radius\n Area = {U+03C0}*pow(r,2)*h\n Volume =" +v;
return  res;

}
public String getResultByd(double d)
{
r= d/2;

String res = "Calculating Radius via using Diameter\n Radius= "+r;
return  res;

}
 public String getResultByr(double r)
    {
    d=2*r;
   
    String res= "Calculating the Diameter via Radius(r) Diameter = 2*r \n Diameter ="+d;
    
    return res;
    }
 public String getResultByvr(double v , double r)
    {
    h= v/(Math.PI*pow(r,2));
   
    String res= "Calculating the Height via Using Volume and Radius(r) Height = v/({U+03C0}*pow(r,2) \n Height ="+h;
    
    return res;
    }
}
