/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ooad;

/**
 *
 * @author Abdul Khaliq
 */
public class CarObject {
    public static void main(String args[]){
        
        ClassCar2 cri=new ClassCar2();
        
        cri.color("RED");
        cri.seats(4);
        cri.speeddecrease(5);
        cri.speedincrease(2);
        
        
        System.out.println("Colour is: \t"+cri.getcolor()+"\n Seates are: \t"+cri.getseats());
    }
}
