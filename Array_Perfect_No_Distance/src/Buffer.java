
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
public class Buffer {
   public static void main(String []args){
    Scanner s=new Scanner(System.in);
        String n[]={"lahore","islamabad","karachi","faisalabad","multan","peeshawar","sargodha","bahawalpur"};
    double x[]={74.338760,73.058968,67.029877,73.074074,71.458397,71.543255,72.669697,71.683331};
    double y[]={31.577365,33.731764,24.921313,31.433936,30.203894,34.012258,32.079956,29.401619};
    double d[]=new double[8];
    String inp;
    inp=JOptionPane.showInputDialog("enter the x");
    double xx=Double.parseDouble(inp);
    inp=JOptionPane.showInputDialog("enter the y");
    double yy=Double.parseDouble(inp);
    inp=JOptionPane.showInputDialog("enter the redius");
    double r=Double.parseDouble(inp);
    for(int a=0;a<8;a++){
        d[a]=Math.sqrt(Math.pow((x[a]-xx), 2)+Math.pow((y[a]-yy), 2));
    }int e=0;
    for(int a=0;a<6;a++){
        if(d[a]<r){JOptionPane.showMessageDialog(null,n[a]+" is inside buffer area");e++;}
        if(d[a]==r){JOptionPane.showMessageDialog(null,n[a]+" is on the boundry of the buffer");e++;}}
if(e==0){JOptionPane.showMessageDialog(null,"no city in the buffer area");}
}
}


 

