
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class CricketArray {
public static void main(String[] args){
 int a[]=new int[6];
int i,j,e = 1, sum  = 0;
for(i=0; i<6; i++){
   e=i+1;
 String x =JOptionPane.showInputDialog("Enter scors at ball"+e);
         a[i]=Integer.parseInt(x);
         sum=sum+a[i];}
 /*System.out.println("totel score is="+sum);}*/
for(j=0; j<6; j++){
        System.out.println("score at ball"+"\t" +(j+1)+ "\tis" +a[j]);}
/*sum=sum+a[j];*/
 System.out.println("totel score is="+sum);
}}
