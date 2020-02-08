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
public class Pyramid {
private double l,h,w,v,ar,lar;
public String getArea(double l,double h,double w)
{
ar= l*w+l*Math.pow(Math.sqrt(w/2),2)+Math.pow(h,2)+w;
String res= "Calculating Surface area via Using length,width and Height \n Area =l*w+l*pow(sqrt(w/2),2)+pow(h,2)+w \n Area ="+ar;
return res;
}
public String getVolume(double l,double h,double w)
{
v= l*w*h/3;
String res= "Calculating Volume via Using length,width and Height \n Volume =lhw/3 \n Volume ="+v;
return res;
}
public String getLateralArea(double l,double h,double w)
{
lar=w*(Math.sqrt(Math.pow(l/2, 2) +Math.pow(h,2)))+l*(Math.sqrt(Math.pow(w/2, 2)+Math.pow(h,2)));
String res= "Calculating Lateral area via Using length,width and Height \n Lateral Area = w*(sqrt(pow(l/2, 2) +pow(h,2)))+l*(sqrt(pow(w/2, 2)+pow(h,2)))\n Area ="+lar;
return res;
}
}
