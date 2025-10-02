import java.util.Scanner;

class Numberinversion{
   public static void main(String args[]){
      int a;
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      invert(a);
   }
   public static void invert(int number){
      int inverted = 0;
      while( number != 0 ){
          inverted = inverted * 10 + number%10;
          number = number/10;
      }

      System.out.println("Reverse of this number is "+inverted);
   }
}