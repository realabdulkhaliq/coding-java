/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package whicals;

import autoMobile.*;

public class Sportcar extends car1 {

    private String name;
    critrias c;

    public Sportcar() {
        name = "0";
        capacity = 0;
        price = 0;
        speed = 0;
    }

    public Sportcar(String name, int c, int s, double price) {
        this.name = name;
        capacity = c;
        speed = s;
        this.price = price;
    }

    public void name(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void speed(double s) {
        speed = s;
    }
    // public void setcapacity(int c) {capacity=c;}
    // public double getcap(){return capacity;}

    public double getspeed() {
        return speed;
    }

    public double getprice() {
        return price;
    }
    public static double w1, w2, w3;

    public void price(double p) {
        price = p;
    }

    public void decreasespeed() {
    }

    public void incerasespeed() {
    }
}
