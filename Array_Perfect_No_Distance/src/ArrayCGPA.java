
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class ArrayCGPA {
   public static void main(String args[]){
        Scanner in = new Scanner(System.in);
         double sem[]=new double[2];
         double marks, gpa, cgpa = 0, a, sum,s;
		int cdHr, tcrdtHr, sb, i = 0,e,j;
		String letrGrd, name ;
		a = 1.0;
		sum = 0.0;
		tcrdtHr = 0;
		gpa = 0;
                System.out.println("Enter your name:");
		name = in.nextLine();
                 for(j=0; j<2; j++){
               double mid[]=new double[2];
       double finl[]=new double[2];
         double sess[]=new double[2];      
            for(i=0; i<2; i++){
                    e=i+1;
			System.out.println("Enter mid marks of subject "+e +":");
			mid[i] = in.nextDouble();
                        System.out.println("Enter final marks of subject "+e +":");
			finl[i] = in.nextDouble();
                        System.out.println("Enter sessanal marks of subject "+e +":");
			sess[i] = in.nextDouble();
                        
                        
			System.out.println("Enter credit hours of subject "+e +":");
			cdHr = in.nextInt();
                        marks=mid[i]+finl[i]+sess[i];
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
			tcrdtHr = tcrdtHr + cdHr;
		}
		cgpa = sum/tcrdtHr;
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

       }/*sum=sum+cgpa;
        s=sum/sem[j];
                System.out.println("CGPA of all semesters is="+s);*/
}}  


  

