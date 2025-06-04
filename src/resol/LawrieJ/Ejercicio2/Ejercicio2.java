package resol.LawrieJ.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        Vehiculo[] vehiculos = new Vehiculo[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese los datos del vehículo " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo (año): ");
            int modelo = sc.nextInt();
            System.out.print("Kilómetros actuales: ");
            double kilometros = sc.nextDouble();
            System.out.print("Kilómetros a recorrer: ");
            int kmsRecorridos = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            vehiculos[i] = new Vehiculo(marca, modelo, kilometros);

            System.out.println("\nInformación inicial del vehículo " + (i + 1) + ":");
            vehiculos[i].mostrarInformacion();
            vehiculos[i].proximoServicio();

            vehiculos[i].recorrer(kmsRecorridos);
            vehiculos[i].proximoServicio();
            System.out.println();
        }
        //sc.close();
    }
}