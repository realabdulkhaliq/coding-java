
public class EmployeeTest {
    public static void main(String args[]){
        
        Employee e1=new Employee("ABDUL","KHALIQ",6400);
        Employee e2=new Employee("ABDUL","KHALIQ",3500);
        
        
        System.out.println("Employee 1: Name"+e1.getFN()+e1.getLN()+"\nSalary Rs:"+e1.getS());
        System.out.println("Employee 2: Name"+e2.getFN()+e2.getLN()+"\nSalary Rs:"+e2.getS());
        
        
        System.out.println("Yearly Salery of 1 Employe Rs:"+e1.getYearly());
        System.out.println("Yearly Salery of 2 Employe Rs:"+e2.getYearly());
        
        
        System.out.println("Yearly Salery of 1 Employe after 10% incentive Rs:"+e1.getIncentive());
        System.out.println("Yearly Salery of 2 Employe after 10% incentive Rs:"+e2.getIncentive());
    }
    }
