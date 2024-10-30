public class Employee{
String firstname;
String lastname;
double salary;
 public  Employee(String fn, String ln,double s){
        if(fn != null) firstname=fn; else firstname="Retry";
        if(ln != null) lastname=ln; else lastname="Retry";
        if(s>0) salary=s; else salary=0;}

   
        
        
         public String getFN(){
            return firstname;}
         public String getLN(){
             return lastname;}
         public double getS(){
             return salary;}
      
         
         
         
          public void setFN(String fn){
           if(fn != null) {firstname=fn;} else {firstname="Retry";}}
        public void setLN(String ln){
           if(ln != null) {lastname=ln;} else {lastname="Retry";}}
        public void setS(double s){
             if(s>0) {salary=s;} else {salary=0;}}



        public double getYearly(){
            return salary*12;}
        
        
        public double getIncentive(){
            return (salary*12 + (salary*12*0.1));
        }
        }




