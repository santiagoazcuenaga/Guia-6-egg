/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package numeromaximo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Numeromaximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner leer = new Scanner(System.in);
int num ;
        System.out.println("ingrese un valor limite positivo");
        num = leer.nextInt();
        int num2;
        int suma;
        suma= 0;
        do {
            System.out.println("ingrese un numero y lo sumaré hasta superar el valor limite ");
            num2= leer.nextInt();
            suma = suma + num2;
        
        }while (num >= suma); 
        
        if (suma > num)
            System.out.println("superó el valor limite!");
    }
}
    

