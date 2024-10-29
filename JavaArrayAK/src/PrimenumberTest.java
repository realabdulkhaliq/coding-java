
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class PrimenumberTest {
    public static void main(String args[]){
        String x =JOptionPane.showInputDialog("Enter any number");
        int a=Integer.parseInt(x);
       if(a%2==0){
           System.out.println("Even");}
       else{System.out.println("Odd");}
       if(a>=0)
          {
           System.out.println("Positive");}
       else{System.out.println("Negative");}
       if(a%7==0){
           System.out.println("Divisible");}
       else{System.out.println("Notdivisible");}
       
        boolean prime=true;
   
        for(int i=2; i<a/2; i++){
            if((a%i)==0){
                prime= false;
                break;
            }
        }
        if(prime)System.out.println("Prime");
        else System.out.println("NOT Prime");
    }
}
