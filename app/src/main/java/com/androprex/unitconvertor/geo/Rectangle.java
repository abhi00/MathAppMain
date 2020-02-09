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
public class Rectangle {
    private double ar,peri,a,b;
    public String getResultforArea(double a,double b)
    {
    ar=a*b;
    String out="calculating Area via side(a)and side(b):ar=a*b \n ar="+ar;
    return out;
    }
    public String getResultforPerim(double a,double b)
    {

        peri=2*(a+b);
        String out="calculating perimeter via side(a)and side(b):Peri=2*(a+b) \n peri="+peri;
        return out;
    }







}
