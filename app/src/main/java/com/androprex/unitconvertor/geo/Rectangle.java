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
    public String getResultByab(double a,double b)
    {
    ar=a*b;
    peri=2*(a+b);
    String out="calculating Area via side(a)and side(b):ar=a*b \n ar="+ar+"\n "+"calculating perimeter via side(a)and side(b):Peri=2*(a+b) \n peri="+peri;
    return out;
    }
    
    
    
    
    
    
   
   public String getResultBypb(double peri,double b)
    {
    
       a=(peri-2*b)/2;
       ar=a*b;
        String out="calculating Area via peri and side(b):ar=a*b \n ar="+ar+"\n "+"calculating   side(a) via perimeter  and side(b):a=(peri-2*b)/2 \n side(a)="+a;
    
   
    return out;
    }
       
   
   public String getResultByara(double ar,double a)
    {
    
       b=ar/a;
       peri=2*(a+b);
       
        String out="calculating side(b) via area and side(a):b=ar/a \n b="+b+"\n "+"calculating    perimeter via area and side(a):peri=2*(a+b)\n peri="+peri;
    
   
    return out;
    } 
        
    
}
