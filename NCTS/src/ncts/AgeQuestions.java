/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ncts;

import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Khaliq
 */
public class AgeQuestions {
   public static void main( String args[]){
       double A, B = 1,a,b,a1,a2,a3,a4,a5,b1,b2,b3,b4,b5;
       String x=JOptionPane.showInputDialog("How many times A is older then B");
     a=Double.parseDouble(x);
       String y=JOptionPane.showInputDialog("After how many years A is double to B");
     b=Double.parseDouble(y);
    // A=a*B;
     B=b/(a-2);
     A=a*B;
     a1=A*365;a2=a1*24; a3=a2*60; a4=a3*60;
      b1=B*365;b2=b1*24; b3=b2*60; b4=b3*60;
      JOptionPane.showMessageDialog(null,"Age of A is="+A+"years \n"+a1+"days \n"+a2+"hours \n"+a3+"minuts \n"+a4+"seconds" );
     JOptionPane.showMessageDialog(null,"Age of B is="+B+"years \n"+b1+"days \n"+b2+"hours \n"+b3+"minuts \n"+b4+"seconds" );
   } 
}
