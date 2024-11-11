/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ooad;

/**
 *
 * @author Abdul Khaliq
 */
public abstract class Car1 extends Carabs1{
    
    
    void Car1(){
    
}
    public void name(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    
    public void price(double p){
        price=p;
    }
    public double getprice(){
        return price;
    }
    
    public void speed(double s){
        speed=s;
    }
    public double getspeed(){
        return speed;
    }
    
    public void capacity(double c){
        capacity=c;
    }
    public double getcapacity(){
        return capacity;
    }
    public void speedincrease(double si){
    }
    public void speeddecrease(double sd){
        speeddecrease=sd;
    }
    public double getspeeddecrease(){
        return speeddecrease;
    }
    
    public void color(String co){
        color=co;
    }
    public String getcolor(){
        return color;
    }
    public void setseats(){
        
    }
    
}
