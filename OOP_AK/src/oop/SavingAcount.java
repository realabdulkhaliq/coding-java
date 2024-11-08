

/**
 *
 * @author Abdul Khaliq
 */
public class SavingAcount {
   public static double AIR;
   private double SB;
   
   
   public SavingAcount(){
       AIR=0.0;
       SB=0.0;}
   
   
   public SavingAcount(double i, double s){
       AIR=i;
       SB=s;}
   
 
   
     public double getSB(){
       return SB;}
   
   public double getAIR(){
       return AIR;}
             
   
   
   public static void modyfyIR(double n){
       AIR=n;}
   
   public void setSB(double nb){
       SB=nb;}
   
   
   public double CalculateMonthlyInterest(){
       double i= (SB + AIR)/10;
       SB=SB+i;
       return i;}
   }

