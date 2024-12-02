/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_ooad;

import javax.swing.JOptionPane;

/**
 *
 * @author Abdul Khaliq
 */
public class MY_OOAD {

    /**
     * @param args  command line arguments
     */
    public static void main(String[] args) {
        
        
        ClassCar1 Honda = new ClassCar1(); 
        ClassCar1 Suzuki = new ClassCar1();
        ClassCar1 BMW = new ClassCar1();
        ClassCar2 My_Car = new ClassCar2();
        
        String a = JOptionPane.showInputDialog(null, "Enter the weight of Price ");
        double a1 = Double.parseDouble(a);

        

        String b = JOptionPane.showInputDialog(null, "Enter the weight of Engine Capacity ");
        double b1 = Double.parseDouble(b);

        

        String c = JOptionPane.showInputDialog(null, "Enter the weight of Speed ");
        double c1 = Double.parseDouble(c);
        
        
        ClassCar1.w1 = (a1/(a1+b1+c1));
        ClassCar1.w2 = (b1/(a1+b1+c1));
        ClassCar1.w3 = (c1/(a1+b1+c1));
        
        
        Honda.name("Honda");
        Honda.price(1500000);
        Honda.capacity(1800);
        Honda.speed(250);




        Suzuki.name("Suzuki");
        Suzuki.price(600000);
        Suzuki.capacity(800);
        Suzuki.speed(140);




        BMW.name("BMW");
        BMW.price(5000000);
        BMW.capacity(30);
        BMW.speed(300);


    double fs1=Honda.getprice()*ClassCar1.w1+Honda.capacity*ClassCar1.w2+Honda.getspeed()*ClassCar1.w3;
    double fs2=Suzuki.getprice()*ClassCar1.w1+Suzuki.getcapacity()*ClassCar1.w2+Suzuki.getspeed()*ClassCar1.w3;
    double fs3=BMW.getprice()*ClassCar1.w1+BMW.getcapacity()*ClassCar1.w2+BMW.getspeed()*ClassCar1.w3;
    
    
        System.out.println("Name\t\tPrice\t\tEngine\t\tSpeed\t\tFinal Score");

        System.out.println("------\t\t------\t\t------\t\t------\t\t-----");



        System.out.println(Honda.getname() + "\t\t" + Honda.getprice() + "\t\t" + Honda.getcapacity() + "\t\t" + Honda.getspeed()+"\t\t"+fs1);




        System.out.println(Suzuki.getname() + "\t\t" + Suzuki.getprice() + "\t\t" + Suzuki.getcapacity() + "\t\t" + Suzuki.getspeed()+"\t\t"+fs2);





        System.out.println(BMW.getname() + "\t\t" + BMW.getprice() + "\t\t" + BMW.getcapacity() + "\t\t" + BMW.getspeed()+"\t\t"+fs3);


        if (fs1>fs2 && fs1>fs3)
            System.out.println("Honda is Best Choice");
        
        else if(fs2>fs1 && fs2>fs3)
            System.out.println("Suzuki is Best Choice");
        
        else if(fs3>fs1 && fs3>fs2)
            System.out.println("BMW is Best Choice");}

           
           }
