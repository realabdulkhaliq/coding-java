
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Rehman
 */
public class Looptest {
 public static void main(String[] args) {
        String n1 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m1 = JOptionPane.showInputDialog(null,"Inser your marks",n1,JOptionPane.QUESTION_MESSAGE);
        int marks1= Integer.parseInt(m1);
        String c1 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch1=Double.parseDouble(c1);
        double gp1=0,gp2=0,gp3=0,gp4=0,gp5=0,gp6=0;
        if (marks1>=85) {
         gp1 = 4;}
        else if(marks1 >= 80) {
        gp1 = 3.7;}
        else if(marks1 >= 75){
        gp1 = 3.3;}
            else if(marks1 >= 70){
        gp1 = 3;}
                else if(marks1 >= 65){
        gp1 = 2.7;}
                    else if(marks1 >= 61){
        gp1 = 2.3;}
                        else if(marks1 >= 58)
        gp1=2.0;
        double gpa1= ch1*gp1;
}}
