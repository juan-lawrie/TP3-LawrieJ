package resol.LawrieJ.Principal;

//import resol.LawrieJ.Ejercicio2.Ejercicio2;
import resol.LawrieJ.Ejercicio1.Ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el ejercicio a ejecutar:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        // Aquí puedes agregar más ejercicios en el futuro
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
             case 2:
             //   Ejercicio2.ejecutar();
             break;
            // case 3: Ejercicio3.ejecutar(); break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}