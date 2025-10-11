
import javax.swing.JOptionPane;


public class Shoppingbill {
    public static void main(String []args){
        int s,rts1;
        double w,p,rts2,rts3,dis1,dis2,dis3,frate1,frate2,frate3;
        String n=JOptionPane.showInputDialog("Enter Shirts Quantity");
        s=Integer.parseInt(n);
        rts1=s*450;
        dis1=rts1/100*2.5;
        frate1=450-dis1;


         String n2=JOptionPane.showInputDialog("Enter Wristwatch Quantity");
        w=Integer.parseInt(n2);
         rts2=w*800.44;
        dis2=rts2/100*2;
        frate2=800.44-dis2;



         String n3=JOptionPane.showInputDialog("Enter Pair of pants Quantity");
        p=Integer.parseInt(n3);
          rts3=p*675.89;
        dis3=rts3/100*4;
        frate3=800.44-dis3;


        JOptionPane.showMessageDialog(null,"Shirt= "+frate1+"\nWrist Watch= "+frate2+"\nPair of Pants= "+frate3+"\nTotal Bill= "+(frate1+frate2+frate3));


    }

}
