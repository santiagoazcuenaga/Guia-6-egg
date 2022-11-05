/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.extra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2Extra {

    /**
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        int num,num2,num3,num4;
      int aux;
      
        System.out.println("ingresa un valor para A");
        num = leer.nextInt();
        System.out.println("ingresa un valor para B");
        num2 = leer.nextInt();
        aux = num2;
        System.out.println("ingresa un valor para C");
        num3 = leer.nextInt();
        System.out.println("ingresa un valor para D");
        num4=leer.nextInt();
        System.out.println("su Valor B se convirtió a :"+(num2 = num3)+" que era el valor C");
        System.out.println("Su valor C se convirtió a :"+(num3 = num)+" que era el valor A");
        System.out.println("Su valor A se convirtió a :"+(num = num4)+" que era el valor D");
        System.out.println("Su valor D se convirtió a :"+(num4 = aux)+" que era el valor B");
        
    }
    
}
