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
public class HemiSphere {
private double r,ar,v;
public String getResultByRadius(double r)
{
ar=2*Math.PI*r*r;
v=(2*Math.PI*r*r*r)/3;
String res = "Calculating Area via Using Radius\n Area = 2*{U+03C0}*r*r \n Area= "+ar+"Calculating Volume via Using Radius\n Volume = (2*{U+03C0}*r*r*r)/3 \n Volume= "+v;
return res;
}
}
