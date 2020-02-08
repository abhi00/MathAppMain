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
public class Rhombus {
    private double ar,peri,a,p,q,alpha,degree;

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

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

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }
    
    public String getResultByareaperi(double ar,double peri)
    {
    a= peri/4;
    alpha= Math.asin(ar/pow(peri/4,2));
    p=Math.sin(alpha/2)*a*2;
    q=2*ar/p;
    degree=alpha*(180/Math.PI);
    
    String res = "calculating side (a)via area and perimeter : a=P/4 \n a="+a+"\n  calculating angle(alpha)via area and perimeter :alpha= asin(A/pow(P/4,2)\n alpha="+alpha+"\n degree = " +degree+"\n  calculating Diagonal(p)via area and perimeter :p= sin(alpha/2)*a*2\n p="+p+"\n  calculating Diagonal(q)via area and perimeter :q= 2*A/p\n p="+q;
                    
     return res;
    
    }
            
    public String getResultBypq(double p,double q)
    {
    
    ar=(p*q)/2;
    a=Math.sqrt(Math.pow(p/2,2)+Math.pow(q/2,2));
    peri= 4*a;
    alpha= Math.atan(p/q)*2;
    
    String res =  "calculating Area(A)via Diagonal(p) and Diagonal(q) : A=(p*q)/2 \n A="+ar+"\n  calculating angle(alpha)via Diagonal(p) and Diagonal(q) :alpha= atan(p/q)*2\n alpha="+alpha+"\n degree = " +degree+"\n  calculating side (a)via Diagonal(p) and Diagonal(q) :a= sqrt(pow(p/2,2)+pow(q2,2)) \n p="+a+"\n  calculating Perimeter(P)via Diagonal(p) and Diagonal(q) :P=4*a\n p="+peri;
   
    return res;
    }
    
    
}
