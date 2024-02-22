
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayCricket {
    public static void main(String[] args) {
        int runs[]=new int[6];
        int wickets[]=new int[6];
        int extra[]=new int[6];
        
        int s = 0, e= 0,t = 0;
       for (int i=0; i<6;  i++) {
    String x1 =JOptionPane.showInputDialog("Enter runs at ball"+(i+1));
        runs[i]=Integer.parseInt(x1);
        String y1 =JOptionPane.showInputDialog("Enter wickets at ball"+(i+1));
        wickets[i]=Integer.parseInt(y1);
         String x2 =JOptionPane.showInputDialog("Enter extras at ball"+(i+1));
        extra[i]=Integer.parseInt(x2); 
        s=s+runs[i];
        e=e+extra[i];
        t=t+(runs[i]+extra[i]);
          JOptionPane.showMessageDialog(null,"Runs=:"+s+"Extras=:"+e+"\n Totel runs are=:"+t);
}} }
 

