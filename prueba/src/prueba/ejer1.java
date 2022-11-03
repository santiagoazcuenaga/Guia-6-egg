//Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por
//pantalla.
package prueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer1 {
    
 public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("ingrese su nombre");
String nombre;
nombre = leer.next();
System.out.println("Bienvenido "+nombre+" ingrese su edad: ");
int edad;
edad= leer.nextInt();
 System.out.println("Su nombre es "+nombre+" y su edad es "+edad);

}
}
   

