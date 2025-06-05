package resol.LawrieJ.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de cuenta: ");
        int nroCuenta = sc.nextInt();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // Limpiar buffer
        System.out.print("Ingrese nombre del titular: ");
        String titular = sc.nextLine();

        Cuenta cuenta = new Cuenta(nroCuenta, saldo, titular);

        System.out.print("Ingrese monto a depositar: ");
        double deposito = sc.nextDouble();
        cuenta.depositar(deposito);

        System.out.print("\nIngrese monto a retirar: ");
        double retiro = sc.nextDouble();
        cuenta.retirar(retiro);

        System.out.println("\nConsulta de saldo:");
        cuenta.consultarSaldo();
        sc.close();
        // sc.close(); // No cerrar si se usa Scanner en otros ejercicios
    }
}