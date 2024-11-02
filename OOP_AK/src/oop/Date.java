
public class Date {
   int day;
   int month;
   int year;
   
   
   public Date(int M, int D, int Y){
       month=M;
       day=D;
       year=Y;}
   
         public int getM(){
            return month;}
         public int getD(){
             return day;}
         public int getY(){
             return year;}
         
         
         public void setM(int M){
             month=M;}
         public void setD(int D){
             day=D;}
         public void setY(int Y){
             year=Y;}
         
         
         public void Display(){
             System.out.print(""+month+"/"+day+"/"+year);
            // JOptionPane.showMessageDialog("Enter Day");
         }
         
   }

