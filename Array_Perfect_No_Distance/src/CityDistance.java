
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class CityDistance {
  public static void main (String args[]){
   
       String a[]={"lahore","islamabad","karachi","faisalabad","multan","peeshawar","sargodha","bahawalpur"};
       String b[]={"l","i","k","f","m","p","s","b"};
       double x[]={74.338760,73.058968,67.029877,73.074074,71.458397,71.543255,72.669697,71.683331};
       double y[]={31.577365,33.731764,24.921313,31.433936,30.203894,34.012258,32.079956,29.401619};
       String b1[]=new String[4];
       int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
       for(int i=0; i<4; i++){
       b1[i]=JOptionPane.showInputDialog("Enter the First LATTER of the City"+(i+1)+" \n lahore \n islamabad \n karachi \n faisalabad \n multan \n peeshawar \n sargodha \n bahawalpur");
       }
       for(int i=0;i<8;i++){
    if(b1[0].equals(b[i])){x1=i;}
    if(b1[1].equals(b[i])){x2=i;}
    if(b1[2].equals(b[i])){x3=i;}
    if(b1[3].equals(b[i])){x4=i;}} 
       
    double d1 = Math.sqrt(((x[x2] - x[x1]) * (x[x2] - x[x1])) + ((y[x2] - y[x1]) * (y[x2] - y[x1])));
    double d2=Math.sqrt(((x[x3]-x[x2])*(x[x3]-x[x2]))+((y[x3]-y[x2])*(y[x3]-y[x2])));
    double d3=Math.sqrt(((x[x4]-x[x3])*(x[x4]-x[x3]))+((y[x4]-y[x3])*(y[x4]-y[x3])));
    d1=d1*111;d2=d2*111;d3=d3*111;
    JOptionPane.showMessageDialog(null,"distance from "+a[0]+" to "+a[1]+" =  "+d1+" kilomerers");
    JOptionPane.showMessageDialog(null,"distance from "+a[1]+" to "+a[2]+" =  "+d2+" kilomerers");
    JOptionPane.showMessageDialog(null,"distance from "+a[2]+" to "+a[3]+" =  "+d3+" kilomerers");
    JOptionPane.showMessageDialog(null,"overall distance "+(d1+d2+d3)+" kilomerers");
    }}
    
    
    

  

