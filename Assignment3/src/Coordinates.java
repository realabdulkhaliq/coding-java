
import javax.swing.JOptionPane;


public class Coordinates {
    public static void main(String []args){
        int x,y;
        String t=JOptionPane.showInputDialog("Enter x=");
        x=Integer.parseInt(t);

        String p=JOptionPane.showInputDialog("Enter y=");
        y=Integer.parseInt(p);
        if(x>=0 && x<=180 && y>=0 && y<=90){
            JOptionPane.showMessageDialog(null,"The quadrant is 1st");}

            else if(x <= 0 && x >= -180 && y >= 0 && y <= 90)
            JOptionPane.showMessageDialog(null,"The quadrant is 2nd");

        
         else if(x <= 0 && x >= -180 && y <= 0 && y >= -90)
           JOptionPane.showMessageDialog(null,"The quadrant is 3rd");
        
        
         else if(x >= 0 && x <=180 && y <= 0 && y >= -90)
            JOptionPane.showMessageDialog(null,"The quadrant is 4th");
        

        }

    }


