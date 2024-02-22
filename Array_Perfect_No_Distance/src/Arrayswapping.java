
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Arrayswapping {
     public static void main(String []args){
          int k = 0,j,i,l,m = 0,n,o;
        int a[]=new int[5];
      int b[]=new int[5];
      int d[]=new int[5];
          for( i=0; i<5; i++){
      String   x=JOptionPane.showInputDialog(null,"enter "+(i+1)+ "number of Array 1");
     a[i]=Integer.parseInt(x); }
    for( j=0; j<5; j++){
      String   x1=JOptionPane.showInputDialog(null,"enter "+(j+1)+ "number of Array 2");
     b[j]=Integer.parseInt(x1);} 
    for( l=0; l<5; l++){
      d[k]=a[l];
      a[l]=b[l];
      b[l]=d[k];
      
   
       System.out.println("=*=*=*=*=*=");
       System.out.println("array 1="+a[l]+"\n array 2="+b[l]);}
    
      for( n=4; n>=0; n--){
      d[m]=a[n];
      a[n]=b[n];
      b[n]=d[m];
      
   
      System.out.println("=@=@=@=@=@=@=");
       System.out.println("array 1="+a[n]+"\n array 2="+b[n]);
       
      }
       for( o=4; o>=0; o--){
        d[m]=a[o];
      a[o]=b[o];
      b[o]=d[m];    
       System.out.println("===============");
       System.out.println("array 1="+a[o]+"\n array 2="+b[o]);
       
      }
      
      }}
   
        
        

