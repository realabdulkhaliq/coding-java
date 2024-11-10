

/**
 *
 * @author Abdul Khaliq
 */
public class SavingAccountTest {
    public static void main(String args[]){
     
        SavingAcount sa1=new SavingAcount();
        SavingAcount sa2=new SavingAcount();
        
        
        sa1.setSB(30000);
        sa2.setSB(20000);
        
        
        SavingAcount.modyfyIR(0.04);
        sa1.CalculateMonthlyInterest();
        sa2.CalculateMonthlyInterest();
        
        
        System.out.println("New balance for 1st saver"+sa1.getSB());
        System.out.println("New balance for 2nd saver"+sa2.getSB());
        
        
        SavingAcount.modyfyIR(0.05);
        sa1.CalculateMonthlyInterest();
        sa2.CalculateMonthlyInterest();
        
        
        System.out.println("New balance for 1st saver"+sa1.getSB());
        System.out.println("New balance for 2nd saver"+sa2.getSB());
    }
}
