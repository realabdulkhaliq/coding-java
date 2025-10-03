
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Rehman
 */
public class Arthematic {


    public static void main(String[] args) {


        double a=12.5;
        double b=3;

        double c;

        String x = JOptionPane.showInputDialog(null,"Enter the operator type (+,-,*,/,%)....");
        char operator = x.charAt(0);


        switch (operator){

            case '+':
                 c=a+b;
                JOptionPane.showMessageDialog(null,"A + B =  "+ c );

                break;
essageDialog(null,"A - B =  "+ c );

                break;

            case '*':
                 c=a*b;
                    JOptionPane.showMessageDialog(null,"A * B =  "+ c );

                break;

            case '/':
                 c=a/b;
                     JOptionPane.showMessageDialog(null,"A / B =  "+ c );

                break;

           case '%':
                 c=a%b;
                    JOptionPane.showMessageDialog(null,"A % B =  "+ c );

                break;


        }




    }

}

