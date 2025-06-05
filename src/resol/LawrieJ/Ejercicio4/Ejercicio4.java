package resol.LawrieJ.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void  ejecutar() {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.print("Ingrese el número de DNI del empleado: ");
    int dni = sc.nextInt();
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = sc2.nextLine();
    System.out.print("Ingrese el sueldo base: ");
    double sueldoBase = sc.nextDouble();
    System.out.print("Ingrese la cantidad de años de antigüedad: ");
    int antiguedad = sc.nextInt();
    sc.close();
    //System.out.println("El empleado con DNI " + dni + " se llama " + nombre + 
                   //    ", tiene un sueldo base de $" + sueldoBase + 
                    //   " y " + antiguedad + " años de antigüedad.");
     Empleado empleado = new Empleado(dni, nombre, sueldoBase, antiguedad);
     empleado.mostrarDetalles();
     sc2.close();
    }}

