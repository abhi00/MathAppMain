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
public class Midpoint {

public String getMidpoint(double  x1,double x2,double y1,double y2)
{
  double x,y;
x=(x1+x2)/2;
y=(y1+y2)/2;


String out="calculating midpoint of line : "+x+","+y;
    return out;
    }



    
}
