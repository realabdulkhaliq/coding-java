
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Abdul Khaliq
 */
public class DateTest {
  public static void main(String args[]){
     
      Scanner A=new Scanner(System.in);
      Date d=new Date(12,9,2013);
      System.out.println(" Enter Month");
      int M=A.nextInt();
      d.setM(M);
       System.out.println(" Enter Day");
       int D=A.nextInt();
      d.setD(D);
      System.out.println(" Enter year");
       int Y=A.nextInt();
      d.setY(Y);
      
      
      d.Display();
  }  
}
