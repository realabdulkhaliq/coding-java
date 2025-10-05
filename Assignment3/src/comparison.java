
import javax.swing.JOptionPane;





public class comparison {
public static void main (String[]args){

String x=JOptionPane.showInputDialog("enter string 1");

String y=JOptionPane.showInputDialog("enter string 2");

if (x.equals(y))
JOptionPane.showMessageDialog(null,"x and y are equal");
else
JOptionPane.showMessageDialog(null,"x and y are not equal");
}

}


