/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ooad;

/**
 *
 * @author Abdul Khaliq
 */
public abstract class Carabs1 implements Vehicle1,Vehicle2{
    
    String name , color;
    double price, capacity, speed, speedincrease, speeddecrease;
    int seats;
    
    public void name(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    
    public void price(){
        
    }
    
    public void speed(){
    
    }
    
    
    public void capacity(){
    }

    public void speedincrease(){
    }

    public void speeddecrease(){
    
    }
    public void color(){
        
    }
    
    public void seats(int st){
        seats=st;
        
    }
    
}
