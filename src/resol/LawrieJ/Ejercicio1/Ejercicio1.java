package resol.LawrieJ.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    private String nombre;
    private int edad;
    private double notaFinal;

    // Constructor
    public Ejercicio1(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota Final: " + notaFinal);
    }

    // Método para indicar si aprobó, regularizó o promocionó
    public void aprobo() {
        if (notaFinal < 6) {
            System.out.println("Estado: Desaprobó");
        } else if (notaFinal <= 8) {
            System.out.println("Estado: Regularizó");
        } else {
            System.out.println("Estado: Promocionó");
        }
    }

    // Método estático ejecutar() que pide datos por pantalla
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        Ejercicio1[] estudiantes = new Ejercicio1[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            sc.nextLine(); // Limpiar buffer si es necesario
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Nota final: ");
            double notaFinal = sc.nextDouble();
            estudiantes[i] = new Ejercicio1(nombre, edad, notaFinal);
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            estudiantes[i].mostrarInformacion();
            estudiantes[i].aprobo();
            System.out.println();
        sc.close();
        }
    }
}