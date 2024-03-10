import javax.swing.JOptionPane;
public class Fectorial{
public static void main (String[] args){
String a;
int t=1,i;
a=JOptionPane.showInputDialog(null,"ENTER THE NO.WHOSE FACTORIAL");
int a1=Integer.parseInt(a);
if (a1>1&&a1<25){
	for (i=a1;i>0;i--){
t=t*i;
System.out.println("FACTORIAL="+t);
//JOptionPane.showMessageDialog(null,""+t);
    }}
else
    JOptionPane.showMessageDialog(null, "INVALID ENTRY!\nNUMBER MUST BE IN BETWEEN 1-25");
   }
}
