/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.transpuesta.negativa;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MatrizTranspuestaNegativa {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        System.out.println("Ingrese 9 valores enteros para una matriz de dimension 3 cuadrada");
        System.out.println("para saber si tiene la propiedad de antisimetría:");
        
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        if (probarAntisimetria(matriz)){
            System.out.println("La matriz tiene la propiedad antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
   
    }

    public static void llenarMatriz(int[][] matriz) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Fila "+i+", columna "+j+":");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }

    public static boolean probarAntisimetria(int[][] matriz){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }   
        }
        return true;
    }
}
    
 

      

