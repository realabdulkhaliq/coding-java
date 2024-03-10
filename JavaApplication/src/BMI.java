
import javax.swing.JOptionPane;

public class BMI {
    public static void main(String[] args){
  String x,y,z;
  double a,b,c,inc,pond,bmi;
  x=JOptionPane.showInputDialog("Enter Mass in kg");
  y=JOptionPane.showInputDialog("Enter Height\n1:Feet");
  z=JOptionPane.showInputDialog("2:Inches");
  a=Double.parseDouble(x);
  b=Double.parseDouble(y);
  c=Double.parseDouble(z);
  inc=(b*12)+c;
  pond=a*2.204;
  bmi=(pond*703)/(inc*inc);
    if (bmi<=16.0){JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+"\nseverly underweight");}
 else if (bmi>16.0&&bmi<=18.5) {
        JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+ "\nunderweight");
    }
 else if (bmi>18.5&&bmi<=25) {
        JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+ "\nnormal");
    }
 else if (bmi > 25 && bmi <= 30) {
        JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+ "\noverweight");
    }
 else if (bmi > 30 && bmi <= 35) {
         JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+ "\nobese class 1");
     }
 else if(bmi > 35 && bmi <= 40)
        {
            JOptionPane.showMessageDialog(null, "YOUR BMI IS:\n"+bmi+"\nobese class 2");
        }
 else if (bmi > 40) {
         JOptionPane.showMessageDialog(null,"YOUR BMI IS:\n"+bmi+ "\nobese class 3");
     }
    }

}
