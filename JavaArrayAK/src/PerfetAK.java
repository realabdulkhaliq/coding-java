/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class PerfetAK {
     public static void main(String[] args){
        for (long a=1;a<10000;a++){
            long c=0;
        for (long b=1;b<a;b++){
            if (a%b==0){c=c+b;}}
            if (c==a){System.out.println(a);}

        }

        }
    }

