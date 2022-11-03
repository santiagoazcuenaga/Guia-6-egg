/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenght;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lenght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
       String frase = null ; //tener en cuenta lo que hace el null, funciona en este caso como un contador de caracteres, sin necesidad de utilizar una variable int
        System.out.println("ingrese una frase, de no mas de 8 caracteres");
        frase = leer.next();
       if (frase.length()  < 8 ) {
           System.out.println("CORRECTO");    
       
       } else {
           System.out.println("INCORRECTO");    
       }
       }
    
}
    
    

