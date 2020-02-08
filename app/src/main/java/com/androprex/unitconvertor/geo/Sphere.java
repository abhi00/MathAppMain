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
public class Sphere {

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
  private double ar,v,r,d;
public String getResultByArea(double ar)
{
r=Math.sqrt(ar/(4*Math.PI));
d= 2*r;
v=4*Math.PI*pow(r,3)/3;
String res = "Calculating Radius via Using Area\n Radius= sqrt(ar/(4*{U+03C0}))\n Radius= "+r+"\n Calculating Diameter via Using Area\n Diameter= 2*r\n Diameter= "+d+"\n Calculating Volume via Using Area\n Volume= 4*{U+03C0}*pow(r,3)/3\n Volume= "+v;

return res;
}
public String getResultByVolume(double v)
{
r=pow(3*v/(4*Math.PI),0.333);
d= 2*r;
ar=4*Math.PI*pow(r,2);
String res = "Calculating Radius via Using Volume \n Radius= pow(3*v/(4*{U+03C0}),1/3)\n Radius= "+r+"\n Calculating Diameter via Using Volume \n Diameter= 2*r\n Diameter= "+d+"\n Calculating Area via Using Volume\n Area= 4*{U+03C0}*pow(r,2)\n Area= "+ar;

return res;
}
public String getResultByRadius(double r)
{
ar=4*Math.PI*pow(r,2);

v= 4*Math.PI*pow(r,3)/3;
d= 2*r;

String res = "Calculating Area via Using Radius \n Area= 4*{U+03C0}*pow(r,2)\n Area= "+ar+"\n Calculating Diameter via Using Radius \n Diameter= 2*r\n Diameter= "+d+"\n Calculating Area via Using Radius\n Volume= 4*{U+03C0}*pow(r,3)/3\n Volume = "+v;

return res;
}
public String getResultByDiameter(double d)
{
r=d/2;
ar=4*Math.PI*pow(r,2);
v= 4*Math.PI*pow(r,3)/3;

String res = "Calculating Area via Using Diameter \n Area= 4*{U+03C0}*pow(r,2)\n Area= "+ar+"\n Calculating Radius via Using Diameter \n Radius= 2*r\n Radius= "+r+"\n Calculating Area via Using Diameter\n Volume= 4*{U+03C0}*pow(r,3)/3\n Volume = "+v;

return res;
}

}
