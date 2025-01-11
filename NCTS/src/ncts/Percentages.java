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
public class Percentages {
   public static void main( String args[]){
      Double a,b,o,e,n;
        // String d=JOptionPane.showInputDialog(null,"Enter last number");
     // Double N= Double.parseDouble(d);
        String A=JOptionPane.showInputDialog("What you want to calculate \n p for %age \n t for Totel \n n for Number");
         char oper = A.charAt(0);
        
        switch(oper){
            case'p':
            String x=JOptionPane.showInputDialog("What is the number whose %age is required");
     a=Double.parseDouble(x);
       String y=JOptionPane.showInputDialog("What are totel number's");
     b=Double.parseDouble(y);
     o=(a/b*100);
                JOptionPane.showMessageDialog(null, +o+"%");
                break;
                case't':
                   String x1=JOptionPane.showInputDialog("What is number");
     a=Double.parseDouble(x1);
       String y1=JOptionPane.showInputDialog("What is %age");
     b=Double.parseDouble(y1);
     e=(a/b*100);
                JOptionPane.showMessageDialog(null,+a+"is"+b+"% of"+ e);
                break;
                     case'n':
                    String x2=JOptionPane.showInputDialog("What is %age");
     a=Double.parseDouble(x2);
       String y2=JOptionPane.showInputDialog("%age of what number");
     b=Double.parseDouble(y2);
     n=(a*b/100);
                JOptionPane.showMessageDialog(null,+a+"% of"+b+"is="+ n);
                break; 
        }
    }  
}
