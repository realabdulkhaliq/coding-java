/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Rehman
 */

import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class CGPA {
 /** Basic concept is Multiply credit hour with Sub.'s Grade Points According to % then total no. of grade points
  divided by total no. of credit hours**/
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
        //////////////////////////
        String n2 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m2 = JOptionPane.showInputDialog(null,"Inser your marks",n2,JOptionPane.QUESTION_MESSAGE);
        int marks2= Integer.parseInt(m2);
        String c2 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch2=Double.parseDouble(c2);
        if (marks2>=85) {
         gp2 = 4;}
        else if(marks2 >= 80) {
        gp2 = 3.7;}
        else if(marks2 >= 75){
        gp2 = 3.3;}
            else if(marks2 >= 70){
        gp2 = 3;}
                else if(marks2 >= 65){
        gp2 = 2.7;}
                    else if(marks2 >= 61){
        gp2 = 2.3;}
                        else if((marks2 >= 58))
        gp2=2.0;
        double gpa2 = ch2*gp2;
        String n3 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m3 = JOptionPane.showInputDialog(null,"Inser your marks",n3,JOptionPane.QUESTION_MESSAGE);
        int marks3= Integer.parseInt(m3);
        String c3 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch3=Double.parseDouble(c3);

        if (marks3>=85) {
         gp3 = 4;}
        else if(marks3 >= 80) {
        gp3 = 3.7;}
        else if(marks3 >= 75){
        gp3 = 3.3;}
            else if(marks3 >= 70){
        gp3 = 3;}
                else if(marks3 >= 65){
        gp3 = 2.7;}
                    else if(marks3 >= 61){
        gp3 = 2.3;}
                        else if(marks3 >= 58)
        gp3=2.0;
        double gpa3= ch3*gp3;
        //////////////////////////
        String n4 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m4 = JOptionPane.showInputDialog(null,"Inser your marks",n4,JOptionPane.QUESTION_MESSAGE);
        int marks4= Integer.parseInt(m4);
        String c4 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch4=Double.parseDouble(c4);
        if (marks4>=85) {
         gp4 = 4;}
        else if(marks4 >= 80) {
        gp4 = 3.7;}
        else if(marks4 >= 75){
        gp4 = 3.3;}
            else if(marks4 >= 70){
        gp4 = 3;}
                else if(marks4 >= 65){
        gp4 = 2.7;}
                    else if(marks4 >= 61){
        gp4 = 2.3;}
                        else if((marks4 >= 58))
        gp4=2.0;
        double gpa4 = ch4*gp4;
        ///////////////////////////////

        String n5 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m5 = JOptionPane.showInputDialog(null,"Inser your marks",n5,JOptionPane.QUESTION_MESSAGE);
        int marks5= Integer.parseInt(m5);
        String c5 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch5=Double.parseDouble(c5);

        if (marks5>=85) {
         gp5 = 4;}
        else if(marks5 >= 80) {
        gp5 = 3.7;}
        else if(marks5 >= 75){
        gp5 = 3.3;}
            else if(marks5 >= 70){
        gp5 = 3;}
                else if(marks5 >= 65){
        gp5 = 2.7;}
                    else if(marks5 >= 61){
        gp5 = 2.3;}
                        else if(marks5 >= 58)
        gp5=2.0;
       double gpa5 = ch5*gp5;
        //////////////////////////
        String n6 =  JOptionPane.showInputDialog(null,"Enter Name","Name",JOptionPane.QUESTION_MESSAGE);
        String m6 = JOptionPane.showInputDialog(null,"Inser your marks",n6,JOptionPane.QUESTION_MESSAGE);
        int marks6= Integer.parseInt(m6);
        String c6 = JOptionPane.showInputDialog(null,"Inser credit hour","Credit Hour",JOptionPane.QUESTION_MESSAGE);
        double ch6=Double.parseDouble(c6);
        if (marks6>=85) {
         gp6 = 4;}
        else if(marks6 >= 80) {
        gp6 = 3.7;}
        else if(marks6 >= 75){
        gp6 = 3.3;}
            else if(marks6 >= 70){
        gp6 = 3;}
                else if(marks6 >= 65){
        gp6 = 2.7;}
                    else if(marks6 >= 61){
        gp6 = 2.3;}
                        else if((marks6 >= 58))
        gp6=2.0;
        double gpa6 = ch6*gp6;
        double cgpa= ((gpa1+gpa2+gpa3+gpa4+gpa5+gpa6)/(ch1+ch2+ch3+ch4+ch5+ch6));

       JOptionPane.showMessageDialog(null,"Name\n"+n1+"\nGrade Points\n"+gpa1+
               "\nName\n"+n2+"\nGrade Points\n"+gpa2+
               "\nName\n"+n3+"\nGrade Points\n"+gpa3+
               "\nName\n"+n4+"\nGrade Points\n"+gpa4+
               "\nName\n"+n5+"\nGrade Points\n"+gpa5+
               "\nName\n"+n6+"\nGrade Points\n"+gpa6+
               "\nYour GPA Is=\n"+cgpa,"CGPA",JOptionPane.PLAIN_MESSAGE);
}
}




