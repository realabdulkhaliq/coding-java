
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Perfect {
    public static void main(String[] args){
        for (long num=1;num<10000;num++){
            long sum=0;
    /* long   num=10000;*/
        for (long i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;}}
            if (sum==num){
                 JOptionPane.showMessageDialog(null,"Perfet number is="+num);}

        }

        }}
    

 

