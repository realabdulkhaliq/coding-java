
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
public class CityDistane {
     public static void main(String[]args){
         int a = 10 ,b  = 10,i,j;
     Scanner s=new Scanner(System.in);
         String city[]={"lahore","islamabad","karachi","faisalabad",
             "multan","peeshawar","sargodha","bahawalpur"};
    double x[]={74.338760,73.058968,67.029877,73.074074,71.458397,71.543255,72.669697,71.683331};
    double y[]={31.577365,33.731764,24.921313,31.433936,30.203894,34.012258,32.079956,29.401619};
    String name[]=new String[2];
    for( i=0;i<2;i++){
        name[i]=JOptionPane.showInputDialog("enter any city name given \n lahore OR islamabad \n OR karachi OR faisalabad \n OR multan OR peeshawar \n OR sargodha OR bahawalpur");}
         for( j=0;j<1;j++){
         if(name[0]==(city[j])){
             a=j;}
    if(name[1]==(city[j])){
        b=j;}
   
        double d1 = ((x[b] - x[a]) * (x[b] - x[a]));  
        double d2 = ((y[b] - y[a]) * (y[b] - y[a]));
        double distance=Math.sqrt(d1+d2);
          distance=distance*111.45;      
          JOptionPane.showMessageDialog(null,"distance in kilometer is="+distance);
        
        
    }
    }
}
