/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author ABDUL KHALIQ-PC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> emp=new ArrayList<Employee>();
     String w=JOptionPane.showInputDialog(null,"Enter Working Hours");
     int workinghoursprweek=Integer.parseInt(w);
        
    try{
    FileReader fr=new FileReader("input.txt");
    BufferedReader br=new BufferedReader(fr);
    
    String buf=br.readLine();
    
    while(buf!=null){
        String token[]=null;
        token=buf.split(" ");
        System.out.println(""+buf);
        buf=br.readLine();
        int costPrHour=Integer.parseInt(token[2]);
        int salary = costPrHour *workinghoursprweek*4;
        System.out.println(""+salary);
        int count = 0;
        count++;
    }}
    catch(IOException e){
        System.out.println(e);}
    
    JFrame fr=new JFrame();
    Container con=fr.getContentPane();
    con.setLayout(new FlowLayout());
    JLabel jl1=new JLabel("Employee ID");
    JLabel jl2=new JLabel("Employee Name");
    JLabel jl3=new JLabel("Cost Per Hour");
    JLabel jl4=new JLabel("Salary");
    
    con.add(jl1);
    con.add(jl2);
    con.add(jl3);
    con.add(jl4);
    int size=emp.size()+2;
    for(int i=0; i<emp.size(); i++){
        Employee s=(Employee)emp.get(i);
    jl1=new JLabel(""+s.getEmpID());
    jl2=new JLabel(""+s.getEmpName());
    jl3=new JLabel(""+s.getCostPrHour());
    jl4=new JLabel(""+s.getSalary());   
    con.add(jl1);
    con.add(jl2);
    con.add(jl3);
    con.add(jl4);
    }
    fr.setSize(400,400);
    fr.setVisible(true);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }
    
  class Employee{
      
     /* Employee class must have the following data members:
•	empId
•	empName
•	costPrHour 
•	salary
*/
      int empId;
      String empName;
      int costPrHour; 
      int salary;
      
  /*Employee class must have the following member methods:
•	Parameterized constructor
•	Getter functions for each data member 
*/
      
      public Employee(int i, String n, int c, int s){
      
          empId=i;
          empName=n;
          costPrHour=c;
          salary=s;
      }
      public Employee(){
      
          empId=0;
          empName="null";
          costPrHour=0;
          salary=0;
      }
      
      public int getEmpID(){
          return empId;
      }
      public String getEmpName(){
          return empName;
      }
      public int getCostPrHour(){
          return costPrHour;
      }
      public int getSalary(){
          return salary;
      }
      
      

}  
}

