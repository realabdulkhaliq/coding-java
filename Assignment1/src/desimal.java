
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class desimal {
    public static void main(String []args){
        String x =JOptionPane.showInputDialog("Enter degree");
        double a = Double.parseDouble(x);
        String y =JOptionPane.showInputDialog("Enter minuit");
         double b = Double.parseDouble(y);
         String z =JOptionPane.showInputDialog("Enter second");
          double c = Double.parseDouble(z);
        double add, e, f;
        e=b/60;
        f=c/3600;
        add=a+e+f;
        JOptionPane.showMessageDialog(null,"desimal degree is="+add);
}}
