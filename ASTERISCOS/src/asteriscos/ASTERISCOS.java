/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteriscos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ASTERISCOS {

    /**
     * @param args the command line arguments
     */
  
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño de tu cuadrado, pesado:");
        int size = leer.nextInt();
        for (int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                if (j==0 || j==size-1 || i==0 || i==size-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
   // TODO code application logic here
    }
    

