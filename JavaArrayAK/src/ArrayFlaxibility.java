
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayFlaxibility {
 public static void main(String args[]){
	int num[]=new int[10];
int i,mod = 0,j; double sum = 0 , mean ,max, min,sub;
String d,sorteddessending="",sortedassending="";;
for( i=0; i<10; i++){
	  d=JOptionPane.showInputDialog(null,"enter number"+(i+1));
       num[i]=Integer.parseInt(d);
sum=sum+num[i];}
     mean=sum/num.length;
    max = num[0];
     min=num[0];
    for(i = 0; i <num.length; i++){
        if(num[i] > max){
            max = num[i];
        }
       if(num[i] < min){
            min = num[i];
      }}
      

    Arrays.sort(num);
    for ( i = 0; i <num.length; i++) {
        sortedassending+="   "+num[i];
    }
   for ( i=0;i<num.length/2;i++){
    sub=num[i];
    num[i]=num[(num.length-1)-i];
    num[(num.length-1)-i]=(int) sub;
}
    for ( i=0;i<num.length;i++){
     sorteddessending+="   "+num[i];
}
  int freq=0;
Arrays.sort(num);
       
    int count = 0;
for ( i = 0; i < num.length; i++) {
       
       for ( j = 0; j < num.length; j++) {
         if (i!=j){
           if (num[i]==num[j]){
               count++;
           if(count+1>mod){
            freq=num[i];}
         }}}
              count++;
                if (count>mod){
                mod=count;}
               count=0;
 
 }  String y,output1="";    
     y= JOptionPane.showInputDialog("Enter the Number which you want to search");
        int n=Integer.parseInt(y);
        for( i=0;i<num.length;i++){
                if(num[i]==n){

                    output1="number"+n+" is present";}
      
                    else {
                    output1="Number is not present";

                }
if(num[i]==n) break;
        }
    
       
     
     JOptionPane.showMessageDialog(null,"Sum= "+sum+"and mean is= "+mean+"\nMaximum number is="+max+
             "and Minimum No is="+min+"\nAssending order is="+sortedassending+"\ndeassending order is="
+sorteddessending+"\n Mode is="+freq+"\n Required number="+output1);
    }}

