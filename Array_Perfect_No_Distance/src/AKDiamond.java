/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdul Khaliq
 */
public class AKDiamond {
     public static void main(String[] args) {

        for (int a = -5; a <= 20; a++) {
            for (int k = -19; k <= 19; k++) {
                if ((Math.abs(a) + Math.abs(k)) <21) 
                    System.out.print("AK");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        } 
    }
}

  

