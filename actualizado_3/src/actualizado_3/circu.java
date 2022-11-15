/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actualizado_3;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class circu {
      private double radio;
private double rr;
    public circu(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        System.out.println("");
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el radio");
        radio = sc.nextDouble();
        return this.radio=radio;
    }    
//public double area(double radio){
//    double area= radio*radio*3.14;
//    System.out.println("el area es: "+ (radio*3.14));
//        return area;
       
  public double perimetro(){
    
        return this.radio * 2 * 3.14;
               
    }
    
    public double area(){
        return this.radio *this.radio * 2 * 3.14;
}
}