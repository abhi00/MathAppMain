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
public class Distance {
    
    public String getDistance(double x1,double x2,double y1,double y2)
    {
    double d;
    d=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
    String out="calculating distance between two points : d="+d;
    return out;
    }
    
    
    
}
