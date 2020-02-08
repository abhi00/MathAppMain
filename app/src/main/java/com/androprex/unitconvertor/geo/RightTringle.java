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
public class RightTringle {
    private double a,b,c,ar,alpha,beta,degree;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }
    public String getSideC(double a,double b)
    {
       c=Math.sqrt(pow(a,2)+pow(b,2));
       String out =   "calculating Side(c) via Side (a)and Side (b): \n"
              +" c= sqrt(pow(a,2)+pow(b,2))"+c;
       return out;
    }
     public String getArea(double a,double b)
    {
       
       ar= (a*b)/2;
       c=Math.sqrt(pow(a,2)+pow(b,2));
       String out =  "for calculating Area via side(a)and Side(b): \n"
              +" A= a*b/2 \n"+ar;
       return out;
    }
    
     public String getBeta(double b,double c )
     {
     beta=Math.asin(b/c);
     degree=beta*180/Math.PI;
    
     
     String res =  "for calculating angle (beta) via Side (b)and Side (c): \n"
              +" beta = asin(b/c) \n beta ="+beta+"\n degree= " +degree;
     return res;
     }
      public String getSideA(double b,double c )
     {
     a=Math.sqrt(pow(c,2)-pow(b,2));
    
    
     
     String res =  "for calculating Side(a) via Side (b)and Side (c): \n"
              +" a= sqrt(pow(c,2)-pow(b,2))"+a;
     return res;
     }
     
      public String getSideB(double a,double c )
     {
     b=Math.sqrt(pow(c,2)-pow(a,2));
     
     String res =  "for calculating Side(b) via Side (a)and Side (c): \n"
              +" b= sqrt(pow(c,2)-pow(a,2))"+b;
     return res;
     }
       public String getAlpha(double a,double c )
     {
    
     alpha =Math.asin(a/c);
    degree=alpha*180/Math.PI;
     
     String res =  "for calculating angle (alpha) via Side (a)and Side (c): \n"
              +" alpha = asin(a/c)\n alpha = "+alpha+"\n degree = " +degree;
     return res;
     }
        
      
}
