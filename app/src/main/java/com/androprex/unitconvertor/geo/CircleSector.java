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
public class CircleSector {



    private double r,alpha,al,ar,radian;
    
    
    public String getResultByralpha(double r, double alpha)
    {
    
    ar= (Math.PI*r*r*alpha)/360;

    
    String res = "Calculating the Area of Sector via Radius (r) and Angle(alpha): Area ={U+03C0}r*r*alpha/360 \n Area= " +ar;
    
    return res;

    }

    public String getResultByal(double r, double alpha) {


        al = r * alpha;
        radian = al * (Math.PI / 180);

        String res = "Calculating the Arc length via Radius (r) and Angle(alpha): Arc length =r*alpha \n Arc length= " + radian;

        return res;
    }
}
