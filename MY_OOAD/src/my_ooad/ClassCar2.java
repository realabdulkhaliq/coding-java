/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ooad;

/**
 *
 * @author Abdul Khaliq
 */
public class ClassCar2 extends Car2 {
    

   public void color(String co){
        color=co;
    }
    public String getcolor(){
        return color;
    }
    
    public void speedincrease(double si){
        speedincrease=si;
    }
    public double getspeedincrease(){
        return speedincrease;
    }
    
    public void speeddecrease(double sd){
        speeddecrease=sd;
    }
    public double getspeeddecrease(){
        return speeddecrease;
    }
    public void seats(int st){
         seats = st;
    }
    public int getseats(){
        return seats;
    }
 
}
