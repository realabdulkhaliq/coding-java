
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIS
 */
public class grade {
    public static void main(String []args){
        String x=JOptionPane.showInputDialog("Enter grade ");
        char   a=x.charAt(0);
        String y=JOptionPane.showInputDialog("Enter Symbol ");
        char   b=y.charAt(0);
        double grade=0;
        //char a='A';
        //char b='+';
        switch (a) {
                case 'A': grade=3.7;
               
                break;
                case 'B':grade =3.3;
               // JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
                case 'C':grade =3;
                //JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
                case 'D':grade =2.7;
                //JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
                case 'E':grade =2.3;
                //JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
                case 'F':grade =0;
                //JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
    default:
        JOptionPane.showMessageDialog(null,"Ivalid");
        break;}
        switch(b){
            case '+':
                grade =grade+0.3;
                JOptionPane.showMessageDialog(null,"Grade is="+grade);
            case '-':
                grade =grade-0.3;
                JOptionPane.showMessageDialog(null,"Grade is="+grade);
                break;
                default:
        JOptionPane.showMessageDialog(null,"Ivalid");

        }

}}
