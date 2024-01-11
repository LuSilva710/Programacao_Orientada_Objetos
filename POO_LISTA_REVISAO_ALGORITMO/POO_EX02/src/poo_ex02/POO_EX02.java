
package poo_ex02;

import java.util.Scanner;

public class POO_EX02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int X;
        int Y;
        
        do {
        X = teclado.nextInt();
        Y = teclado.nextInt();
        
        if ((X > 0) && (Y > 0)) {
            System.out.println("Primeiro");      
        }
        else if ((X < 0) && (Y > 0)){
            System.out.println("Segundo"); 
        }
        else if ((X < 0) && (Y < 0)){
            System.out.println("Terceiro"); 
        }
        else if ((X > 0) && (Y <0)){
           System.out.println("Quarto"); 
        }
        } while ((X != 0) && (Y != 0));
        teclado.close();
    } 
}
