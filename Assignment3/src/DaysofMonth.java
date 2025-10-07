
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Rehman
 */
public class DaysofMonth {
    public static void main(String args[]) {
       //jan=31,feb=28,march=31,april=30,may=31,jun=30,july=31,aug=31,sep=30,oct=31,nov=30,dec=31;
 // April
int days=0;
String x=JOptionPane.showInputDialog(null,"Enter Month","MONTH",JOptionPane.QUESTION_MESSAGE);
int month=Integer.parseInt(x);
if (month<=12){
        if(month == 1 || month == 3 || month == 5 || month==7||month==8||month==10||month==12)
        days = 31;
        else if(month == 4 || month == 6 || month == 9||month==10)
        days = 30;
        else if(month == 2)
        days=28;
        JOptionPane.showMessageDialog(null,"No. of Days\n " + days,"DAYS",JOptionPane.INFORMATION_MESSAGE);}

 else
            JOptionPane.showMessageDialog(null,"Wrong Input","Invalid",JOptionPane.INFORMATION_MESSAGE);
        }
       

}

