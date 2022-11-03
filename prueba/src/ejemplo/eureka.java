/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class eureka {
 public static void main(String[] args){
     Scanner leer  = new Scanner (System.in);
     String frase;
     System.out.println("ingrese una frase");
     frase = leer.next();
     
     if (frase.equals("eureka")){
         System.out.println("Su frase es correcta");
         }else{
          System.out.println("su frase es incorrecta");
             
       }
     }
 }
     
