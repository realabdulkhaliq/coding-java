
import javax.swing.JOptionPane;


public class Calls {
     public static void main(String []args){
         //ON-NET=1, OFF-NET=2 , PTCL=3 , INTL = 4
         double onnet = 3.3333333 ;// per sec
         double offnet =5.8333333;
         double ptcl = 1.6666667;
         double intl= 16.666667;
         String x =JOptionPane.showInputDialog("Enter No. Mins");
         double min=Double.parseDouble(x);
          String z =JOptionPane.showInputDialog("Enter No. Seconds");
          double sec2=Double.parseDouble(z);
         double sec = (min*60)+sec2;
         String y=JOptionPane.showInputDialog("Enter Network \nON-NET=1, OFF-NET=2 , PTCL=3 , INTL = 4");
         double network=Double.parseDouble(y);
         double rs=0;

         if (network ==1 ) { rs=(sec*onnet)/100;
             JOptionPane.showMessageDialog(null,"onnet Bill is\n" + rs);}
                    else if  (network==2) {rs=(int)(sec*offnet)/100;

                    JOptionPane.showMessageDialog(null,"offnet Bill is\n"  +rs);}
           else if (network==3){ rs=(int) (sec*ptcl)/100;
                    JOptionPane.showMessageDialog(null,"ptcl Bill is\n" + rs);}
          else if (network==4){ rs=(int)(sec*intl)/100;
                    JOptionPane.showMessageDialog(null,"ptcl Bill is\n" + rs);}



}

     }


