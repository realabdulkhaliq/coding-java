
import javax.swing.JOptionPane;


public class BMI {




    public static void main(String[] args){

  int m,h1,h2,h3,nh1,nh2,m1;
   String x =JOptionPane.showInputDialog("Enter Mass in Pounds:  ");
        m=Integer.parseInt(x);
        double mkg=0.45359237*m;


         String x1 =JOptionPane.showInputDialog("Enter Hieght in Feet:   ");
        double f=Integer.parseInt(x1);
            double inc=12*f;
        String x3 =JOptionPane.showInputDialog("Enter Hieght in inches:   ");
        h2=Integer.parseInt(x3);
double th=(h2+inc)*0.0254;   //in meters(1inch=0.0254m)inch to m

double BMI=mkg/(th*th);
double BMIin=BMI*3417.171903;
JOptionPane.showMessageDialog(null,"BMI lb/(in)Squar\n"+BMIin,"BMI",JOptionPane.INFORMATION_MESSAGE);
if(BMI<16.0){

    JOptionPane.showMessageDialog(null,"Severly Underweight");
}

        else if(BMI >= 16.0 && BMI <= 18.5)
        {

    JOptionPane.showMessageDialog(null,"Underweight");
}

        else if(BMI > 18.5 && BMI <= 25)
        {

    JOptionPane.showMessageDialog(null,"Normal");
}

        else if(BMI > 25 && BMI <= 30)
        {

    JOptionPane.showMessageDialog(null,"Overrweight");
}

        else if(BMI > 30 && BMI <= 35)
        {

    JOptionPane.showMessageDialog(null,"Obese ClassI");
}

        else if(BMI > 35 && BMI <= 40)
        {

    JOptionPane.showMessageDialog(null,"Obese ClassII");
}

        else if(BMI > 40)
        {

    JOptionPane.showMessageDialog(null,"Obese ClassIII");
}

}
}



