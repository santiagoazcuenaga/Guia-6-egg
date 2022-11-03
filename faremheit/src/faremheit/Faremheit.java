/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faremheit;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Usuario
 */
public class Faremheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    double celcio;
        System.out.println("ingrese una temperatura en centigrados y lo pasare a F");
        celcio=leer.nextInt();
    double  fahrenheit;
        fahrenheit = 32 + (9 * celcio / 5);
        System.out.println("su temperatura en F es : "+fahrenheit);    
                
        
       
      
    
    
    
    
    
    
    }
    
    
}
