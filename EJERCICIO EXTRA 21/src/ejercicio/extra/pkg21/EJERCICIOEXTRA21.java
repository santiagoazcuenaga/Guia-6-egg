/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERCICIOEXTRA21 {

    /**
     * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      int cantalumno;
      cantalumno = 0;
      double primerintegrador;
      double segundointegrador;
      double tpevaluativo ;
      double tpevaluativo2;
      int alumnoaprobado;
      alumnoaprobado = 0;
      int alumnoreprobado;
      alumnoreprobado = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("ingrese el nombre del alumno");
            String nombrealumno = leer.next();
            cantalumno++;
            System.out.println("Ingrese la nota del primer trabajo practico evaluativo");
            tpevaluativo = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo practico evaluativo");
            tpevaluativo2=leer.nextDouble();
            System.out.println("Ingrese la nota del primer trabajo integrador");
            primerintegrador = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo integrador");
            segundointegrador = leer.nextDouble();
          double notafinal = (0.10 * tpevaluativo) + (0.15 * tpevaluativo2) + (0.25 * primerintegrador) + (0.50 * segundointegrador);
          if (notafinal > 7){
              alumnoaprobado++;
          }else{
              alumnoreprobado++;
          }
            }
         System.out.println("La cantidad de alumnos aprobados es de "+alumnoaprobado +" y la de reprobados es de "+alumnoreprobado);
            
            
        }
    }
    

