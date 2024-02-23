
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Perfectnumber {
    public static void main(String[] args){
        for (int i=1;i<10000;i++){
            int num=0;
        for (int j=1;j<i;j++){
            if (i%j==0){
                num=num+j;
            }
        }
            if (num==i){
              JOptionPane.showMessageDialog(null,"Number is="+i);
                }

        }

        } 
}
