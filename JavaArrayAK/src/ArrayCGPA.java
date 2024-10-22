
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayCGPA {
  public static void main(String args[]){
       int aa = 0,i,j,e; double sum,s = 0,f = 0,m = 0;
        double gpa[]=new double[aa];
        
        /* String xx =JOptionPane.showInputDialog("Enter number of semester's");
          gpa[aa]= Double.parseDouble(xx);
        for( j=0; j<aa; j++){*/
        String name[]=new String[2];
         double mid[]=new double[2];
       double finl[]=new double[2];
         double sess[]=new double[2];
          for( i=0; i<2; i++){
       String n=JOptionPane.showInputDialog("Enter Subjet name");
       e=i+1;
         String x =JOptionPane.showInputDialog("Enter mid marks of subject "+n +":");
          mid[i]= Double.parseDouble(x);
         String y =JOptionPane.showInputDialog("Enter final marks of subject "+n +":");
         finl[i]= Double.parseDouble(y);
         String z =JOptionPane.showInputDialog("Enter sessanal marks of subject "+n +":");
          sess[i]= Double.parseDouble(z);
          m=m+mid[i];  f+=finl[i];  s+=sess[i];
          sum=mid[i]+finl[i]+sess[i];
            JOptionPane.showMessageDialog(null,"marks in "+n+"\t are"+sum);}
             JOptionPane.showMessageDialog(null,"Aerage of mid marks is="+(m/2)+
                    "\nAerage of final marks is="+(f/2)+
                     "\nAerage of sessional marks is="+(s/2));
        }}
      /*  JOptionPane.showMessageDialog(null,"marks"+j); 
   }}*/
		


