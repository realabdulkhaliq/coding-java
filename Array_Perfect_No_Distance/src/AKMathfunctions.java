
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class AKMathfunctions {
     public static void main(String args[]){
    
        String d=JOptionPane.showInputDialog(null,"Enter Any Number ");
        double a= Double.parseDouble(d);
        double a1=Math.sqrt(a);
        System.out.println("1 Square root of number is="+a1);
        double a2=Math.pow(a,2);
        System.out.println("2 Square is="+a2);
        double a3=Math.sin(a);
        System.out.println("3 Sine of angle is="+a3);
        double a4=Math.cos(a);
        System.out.println("4 Cosine of angle="+a4);
        double a5=Math.tan(a);
        System.out.println("5 Tangent of angle="+a5);
        double a6=Math.sinh(a);
        System.out.println("5 Sine hyperbola="+a6);
        double a7=Math.cosh(a);
        System.out.println("7 Cosine hyperbola="+a7);
        double a8=Math.tanh(a);
        System.out.println("8 Tangent hyperbola="+a8);
        double a9=Math.abs(a);
        System.out.println("9 Absolute="+a9);
        double a10=Math.log(a);
        System.out.println("10 Logarithm="+a10);
        double a11=Math.log10(a);
        System.out.println("11 Log of base 10="+a11);
        double a12=Math.exp(a);
        System.out.println("12 Exponent="+a12);
    }}
        
    

