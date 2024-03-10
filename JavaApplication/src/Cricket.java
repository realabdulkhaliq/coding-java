import javax.swing.JOptionPane;
public class Cricket {
public static void main(String[] args){
String a,b,c;
int x1=0,y1=0,z1=0,x,y,z;
for (int i=1;i<=6;i++){
    a=JOptionPane.showInputDialog(i+" ball"+"\nEnter run");
b=JOptionPane.showInputDialog(i+"  ball"+"\nEnter wicket");
c=JOptionPane.showInputDialog(i+"  ball"+"\nEnter Extra");
x=Integer.parseInt(a);
y=Integer.parseInt(b);
z=Integer.parseInt(c);
x1=x+x1;
y1=y+y1;
z1=z+z1;}
JOptionPane.showMessageDialog(null,"RUNS\n"+x1+"\nWICKETS\n"+y1+"\nEXTRA\n"+z1);
}
}
