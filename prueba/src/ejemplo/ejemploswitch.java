/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejemploswitch {
    
public static  void main(String[] args){
    
Scanner leer= new Scanner(System.in) ;


int tipomotor;

System.out.println("ingrese un valor del 1 al 4 para ver el tipo de bomba" );

tipomotor=leer.nextInt();
        
switch (tipomotor) {
        case 1: 
          System.out.println("La bomba es una bomba de agua");
          break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
        case 3:
            System.out.println("La bomba es una bomba de hormigón");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
        break;
        default:
            System.out.println("numero equivocado");
            
        }
       
            

}    
}



