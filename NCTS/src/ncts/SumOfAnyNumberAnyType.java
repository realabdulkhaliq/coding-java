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
public class SumOfAnyNumberAnyType {
 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */

    public static void main(String args[]){
        Double o,e,n;
         String d=JOptionPane.showInputDialog(null,"Enter last number");
      Double N= Double.parseDouble(d);
        String A=JOptionPane.showInputDialog("Enter o for odd \n e for even \n n for all numbers");
         char oper = A.charAt(0);
        
        switch(oper){
            case'o':
           o=(N*(N/2))/2;
                JOptionPane.showMessageDialog(null, o);
                break;
                case'e':
                    e=((N*(N/2))/2)+(N/2);
                JOptionPane.showMessageDialog(null, e);
                break;
                     case'n':
                    e=(N*(N/2))+(N/2);
                JOptionPane.showMessageDialog(null, e);
                break; 
        }
    }
    }

  

