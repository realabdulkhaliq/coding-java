
import javax.swing.JOptionPane;


public class Leapyear {
    public static void main(String []args){

        int year;
        String x =JOptionPane.showInputDialog("Enter year ");
        year=Integer.parseInt(x);
        if(year%4==0){
                           if(year%4==0 && year%400==0){
                                JOptionPane.showMessageDialog(null,"Entered Year is not leap year");
                               
                                                        }
                            else{
                                JOptionPane.showMessageDialog(null," Enterd Year is leap year");
                                   }
            
                       }
        else{
            JOptionPane.showMessageDialog(null,"Enterd Year is not leap year");
            }


    }

}
