
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
        String name[]=new String[5];
        for(int i=0; i<5; i++){
         String x=JOptionPane.showInputDialog("Enter name");}
          float mid[]=new float[5];
        for(int j=0; j<5; j++){
           
          String y =JOptionPane.showInputDialog("Enter marks out off 35");
         mid[j]=Integer.parseInt(y);}
  float finl[]=new float[5];
        for(int k=0; k<5; k++){
          String z =JOptionPane.showInputDialog("Enter marks out off 40");
         finl[k]=Integer.parseInt(z);}
 float sess[]=new float[5];
        for(int l=0; l<5; l++){
          String xx =JOptionPane.showInputDialog("Enter marks out off 25");
         sess[l]=Integer.parseInt(xx);}
        int j = 0,k = 0,l = 0;
         float mavg=mid[j]/6;
        float favg=finl[k]/6;
        float savg=sess[l]/6;
        float m=mid[j]/35;
        float f=finl[k]/40;
        float s=sess[l]/25;
        float totel=m+f+s;
        JOptionPane.showMessageDialog(null,"your Average in mid is="+mavg+"\nyour Average in final is="+favg+"\nyour Average in sessional is="+savg);
        
        JOptionPane.showMessageDialog(null,"your total avg is="+totel);
        }
    }

