
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Speed {
    public static void main(String []args){
        for(int i=1; i<10000; i++){
            int num=0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    num=num+j;
                    
                }
            }
            if(num==i){
                System.out.println(i);
        }

/*System.out.println("Enter distance in meters");


Scanner s1=new Scanner(System.in);
String d=s1.nextLine();
double distance=Double.parseDouble(d);
System.out.println("Enter Time in seconds");
String t=s1.nextLine();
double time=Double.parseDouble(t);
double v=distance/time;

//String t=s1.nextLine();
System.out.println("Speed of car "+v+"m/s");*/
}
    }}


