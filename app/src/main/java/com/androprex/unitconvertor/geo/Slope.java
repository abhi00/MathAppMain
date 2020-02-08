/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.androprex.unitconvertor.geo;

/**
 *
 * @author ritesh pathak
 */
public class Slope {

public String getSlope(double  x1,double x2,double y1,double y2)
{
  double m;
m=((y2-y1)/(x2-x1));



String out="calculating Slope of line : m=((y2-y1)/(x2-x1))\n  slope(m)="+m;
    return out;
    }


    
}
