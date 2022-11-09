/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9extra;

/**
 *
 * @author Usuario
 */
public class Ejercicio9extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

        System.out.println("Numero 1");
        int num1 = leer.nextInt();
        System.out.println("Numero 2");
        int num2 = leer.nextInt();

        int cont = 0;

        if (num1 > num2) {
            while (num1 > num2) {
                num1 = num1 - num2;
                cont++;
            }
            System.out.println("El residuo es :" + num1);
            System.out.println("El cociente es :" + cont);

        } else if (num1 <= num2) {
            System.out.println("Resta no posible");
        }

    }
    }
    
