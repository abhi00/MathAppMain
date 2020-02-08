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
public class Parallelogram {
   private double ar,peri,a,b,alpha,h,degree;

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

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

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
   
   public String getResultBybh(double b, double h)
   {
   
   ar= b*h;
   
   String res = "calculating Area(A)via Side(b)and Height(h):  A=b*h\n A=" +ar;
   return res;
   
   }
   
    public String getResultByab(double a, double b)
   {
   
   peri = 2*(a+b);
   
   String res = "calculating Perimeter (P)via Side(a)and Side (b):  P=2*(a+b)\n P=" +peri;
   return res;
}
     public String getResultBypb(double peri, double b)
   {
   
   a = (peri/2)-b;
   
   String res = "calculating Side(a)via Perimeter(P)and Side (b):  a=P/2-b\n P=" +a;
   return res;
}
       public String getResultByarh(double ar, double h)
   {
   
   b=  ar/h;
   
  String res = "calculating Side(b)via Area(A)and Height(H):  b= A/h \n b=" +b;
   return res;
}
       
   public String getResultByha(double h, double a)
   {
   
   alpha= Math.asin(h/a);
   degree = alpha*(180/Math.PI);
   
  String res = "calculating Angle(alpha)via Height(H)and Side (a):  alpha= asin(h/a) \n alpha=" +alpha+"\n degree"+degree;
   return res;
}
   

       
       
}
