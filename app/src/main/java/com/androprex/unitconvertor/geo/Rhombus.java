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

            
    public String getResultforArea(double p,double q)
    {
    
    ar=(p*q)/2;
    
    String res =  "calculating Area(A)via Diagonal(p) and Diagonal(q) : A=(p*q)/2 \n A="+ar;
    return res;
    }

    public String getResultforPerim(double p,double q)
    {

        a=Math.sqrt(Math.pow(p/2,2)+Math.pow(q/2,2));
        peri= 4*a;

        String res = "calculating Perimeter(P)via Diagonal(p) and Diagonal(q) :\n a=sqrt(pow(p/2,2)+(pow(q/2,2))\n then P=4*a\n p="+peri;

        return res;
    }


    public String getResultforAlpha(double p,double q)
    {
        a=Math.sqrt(Math.pow(p/2,2)+Math.pow(q/2,2));
        alpha= Math.atan(p/q)*2;

        String res =  "calculating angle(alpha)via Diagonal(p),Diagonal(q)and Side(a) :alpha= atan(p/q)*2\n alpha="+alpha;

        return res;
    }






}
