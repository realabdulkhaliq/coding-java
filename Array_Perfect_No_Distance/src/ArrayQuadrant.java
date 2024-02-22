
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayQuadrant {
    public static void main(String args[]){
          double a[]=new double[4];
double b[]=new double[4];
     
     String d, e, f;
    for(int i=0; i<4; i++){
      d=JOptionPane.showInputDialog(null,"enter x");
       a[i]= Double.parseDouble(d);
        e=JOptionPane.showInputDialog(null,"enter y");
       b[i]= Double.parseDouble(e);
       if(a[i]>=0 && b[i]>=0)
        JOptionPane.showMessageDialog(null,"1st quadrent");
        else if(a[i]<0 && b[i]>=0)
        JOptionPane.showMessageDialog(null,"2nd quadrent"); 
        else if(a[i]<0 && b[i]<0)
        JOptionPane.showMessageDialog(null,"3rd quadrent"); 
        else if(a[i]>=0 && b[i]<0)
        JOptionPane.showMessageDialog(null,"4th quadrent"); 
       } 
}}
