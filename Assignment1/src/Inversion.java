
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Inversion {
   public static void main(String []args){
        String x =JOptionPane.showInputDialog("Enter number");
        int a=Integer.parseInt(x);
        int i = 0;
      while( a != 0 ){
          i = i * 10 + a%10;
         a=a/10;
           
        }
         System.out.println("Reverse of this number is "+i);
}}
