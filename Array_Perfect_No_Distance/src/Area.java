
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class Area {
    public static void main(String []args){
System.out.println("Enter your radius");
 Scanner s=new Scanner(System.in);
   String x=s.nextLine();

   double r=Double.parseDouble(x);
 double area=(3.1428571)*r*r;
 double circumference=2*3.1428571*r;
System.out.println("Your area is ="+area+" and "+"circumferencce="+circumference);
}
}


