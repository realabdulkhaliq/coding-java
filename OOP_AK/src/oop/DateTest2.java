
import javax.swing.JOptionPane;


/**
 *
 * @author Abdul Khaliq
 */
public class DateTest2 {
    public static void main(String args[]){
        Date d=new Date(12,9,2013);
        String a=JOptionPane.showInputDialog("Enter Month");
        int M=Integer.parseInt(a);
        d.setM(M);
        String b=JOptionPane.showInputDialog("Enter Day");
        int D=Integer.parseInt(b);
        d.setD(D);
        String c=JOptionPane.showInputDialog("Enter year");
        int Y=Integer.parseInt(c);
        d.setY(Y); 
        d.Display();
    }
}
