


import java.util.Scanner;

public class distane {
public static void main(String[]args) {



    System.out.println("what is x1?");
Scanner a=new Scanner(System.in);
String b=a.nextLine ();
int h=Integer.parseInt(b);
System.out.println("what is x2?");
String x=a.nextLine ();
int y=Integer.parseInt(x);
System.out.println("what is y1?");
String t=a.nextLine ();
int k=Integer.parseInt(t);
System.out.println("what is y2?");
String w=a.nextLine ();
int m=Integer.parseInt(w);
int r=y-h;
int d=m-k;
int sq= (int) Math.pow(r, 2);
int saq=(int) Math.pow(d, 2);
int add=sq+saq;
float sqrt=(int) Math.sqrt(add);
       System.out.println("the distance is =  "  +sqrt+"m");




}

}