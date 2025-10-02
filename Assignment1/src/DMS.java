import java.util.Scanner;
public class DMS {
public static void main(String[] args) {
double deg,min,scnd,dd,b,c,d;
System.out.println("what is degree?");
Scanner a=new Scanner(System.in);
deg=a.nextDouble();
System.out.println("What is minut?");
min=a.nextDouble();
System.out.println("what is secound?");
scnd=a.nextDouble();
b=min/60;
c=scnd/3600;
dd=deg+b+c;
System.out.println("Decimal Degreee: "+dd);
}
}
