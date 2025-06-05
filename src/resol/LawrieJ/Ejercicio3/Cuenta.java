package resol.LawrieJ.Ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    private int nroCuenta;
    private double saldo;
    private String titular;

    public Cuenta(int nroCuenta, double saldo, String titular) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        registrarTransaccion("Depósito", cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            registrarTransaccion("Retiro", cantidad);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + cantidad);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public void registrarTransaccion(String tipo, double monto) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("[" + ahora.format(formato) + "] " + tipo + " de $" + monto);
    }
}
/*
 * 
 */