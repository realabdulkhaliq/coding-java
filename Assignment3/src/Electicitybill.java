
import javax.swing.JOptionPane;

public class Electicitybill {

    public static void main(String []args){
        String x =JOptionPane.showInputDialog("Enter Units ");
        int unit=Integer.parseInt(x);
        int u1=0,u2=0,u3=0,u4=0;
        
                if(unit<=100){
                    u1 =unit;
                }
 else if(unit>100 && unit<=200){
      u1 = unit -(unit-100);
     u2 = unit -u1;
 }
 else if(unit>200 && unit<=300){
      u1 = unit -(unit-100);
     u2 = unit -u1;
     
 }
            else if(unit>300 && unit<=400){
      u1 = unit -(unit-100);
     u2 = unit -(unit-200);
     u3 = unit -(u2+u1);

 }
else if(unit>400 && unit<=500){
      u1 = unit -(unit-100);
     u2 = unit -(unit-200);
     u3 = unit -(u1+u2);}

        else if(unit>500){
     u1 = unit -(unit-100);
     u2 = unit -(unit-200);
     u3 = unit - (unit-200);
     u4 = unit-(u1+u2+u3);
    }
        double rt1=u1*5.79,rt2=u2*8.11,rt3=u3*11.65,rt4=u4*15;
double tax=(rt1+rt2+rt3+rt4)*(10/100);
double frate1 =(rt1+rt2+rt3+rt4);
double frate = tax+frate1;
        JOptionPane.showMessageDialog(null,"Total Bill=\n"+frate);


    }
}
