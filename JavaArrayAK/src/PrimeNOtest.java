
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class PrimeNOtest {
  public static void main(String[] args){
        int prime[]={2,3,5,7,13,17,19};//beacuse 2^11-1 is not prime so it is excluded
        double d[]=new double[prime.length];
        int i;

       String output="";
        for (i=0;i<prime.length;i++){

        d[i]= (Math.pow(2,prime[i]-1))*(Math.pow(2, prime[i])-1);
        }
for (int j=0;j<prime.length;j++){

            output+="Perfect Numbers="+d[j]+"\n";
}
        JOptionPane.showMessageDialog(null,output);

}}