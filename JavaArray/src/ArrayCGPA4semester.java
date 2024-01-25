
import java.util.Scanner;







/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayCGPA4semester {
   
   public static void main(String args[]){
       double gpa = 0, totalcrdtHr = 0,a, sum = 0, cgpa = 0,ak = 0;
int cdHr,j = 0;
String  letrGrd;

		Scanner ss = new Scanner(System.in);
   System.out.println("Enter your name:");
  String  name = ss.nextLine();
   double sem[]=new double[2];
 
        for( j=0; j<2; j++){{ 
            
       double mid[]=new double[2];
       double finl[]=new double[2];
         double sess[]=new double[2];
         
		for(int i=0; i<2; i++){
                 /*   System.out.println("Enter number of subjects:");
		int sub = ss.nextInt(); */
                    
           System.out.println("Enter marks in mid of subject "+(i+1) +":");
			mid[i] = ss.nextDouble();         
                    
            System.out.println("Enter marks in final of subject "+(i+1) +":");
			finl[i] = ss.nextDouble();        
                    
           System.out.println("Enter marks in sessional of subject "+(i+1) +":");
			sess[i] = ss.nextDouble();         
                
		double marks=mid[i]+finl[i]+sess[i];
                
			System.out.println("Enter credit hours of subject "+(i+1)+":");
			 cdHr = ss.nextInt();
			if (marks>84){
			    gpa = 4.00;
			  letrGrd = "A";
			   System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>79 && marks<=84){
			   gpa = 3.70;
			    letrGrd = "A-";
			   System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>74 && marks<=79){
		   	     gpa = 3.30;
		   		 letrGrd = "B+";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>69 && marks<=74){
		   		 gpa = 3.00;
		   		letrGrd ="B" ;
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>64 && marks<=69){
		   		 gpa = 2.70;
		   		 letrGrd = "B-";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>60 && marks<=64){
		   		 gpa = 2.70;
		   		 letrGrd = "C+";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>57 && marks<=60){
		   	   gpa = 2.00;
		   		letrGrd = "C";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>54 && marks<=57){
		   		 gpa = 1.70;
		   		 letrGrd = "C-";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks>=50 && marks<=54){
		   		gpa = 1.00;
		   		letrGrd = "D";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }
		   else if(marks<50){
		   		 gpa = 0.00;
		   		 letrGrd ="F";
		   		System.out.println("Your GPA for this subject is : "+gpa+ "  and LETTER GRADE is :"+ letrGrd);
		   }



			 a = gpa * cdHr;
			 sum = sum + a;
			 totalcrdtHr = totalcrdtHr + cdHr;
		
		 cgpa = sum/totalcrdtHr;}
   if(cgpa>=4.00)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : A");
		else if(cgpa>=3.70 && cgpa<4.00)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : A-");
		else if(cgpa>=3.30 && cgpa<3.70)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : B+");
		else if(cgpa>=3.00 && cgpa<3.30)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : B");
		else if(cgpa>=2.70 && cgpa<3.00)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : B-");
		else if(cgpa>=2.30 && cgpa<2.70)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : C+");
		else if(cgpa>=2.00 && cgpa<2.30)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : C");
		else if(cgpa>=1.70 && cgpa<2.00)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : C-");
		else if(cgpa>=1.00 && cgpa<1.70)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : D");
		else if(cgpa<1.00)
		   System.out.println("CGPA of "+ name + "is : "+ cgpa+ "  and \n final LETTER GRADE is : F");
        }

   
   
        
        System.out.println("your Cgpa for semester"+(j+1)+"is"+cgpa);}
        
      /* ak=(cgpa+cgpa)/2; 
        System.out.println("your Cgpa for all semester's is=:"+ak);*/
                
        }}