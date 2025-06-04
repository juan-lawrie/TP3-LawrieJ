package resol.LawrieJ.Ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    protected String nombre;
    protected String dni;
    protected LocalDate fechaPrestamo;
    protected double montoSolicitado;
    protected LocalDate fechaPactadaPago;
    protected LocalDate fechaPagoEfectivo;

    public Cliente(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.fechaPactadaPago = fechaPactadaPago;
    }

    public void setFechaPagoEfectivo(LocalDate fechaPagoEfectivo) {
        this.fechaPagoEfectivo = fechaPagoEfectivo;
    }

    public long diasAtraso() {
        if (fechaPagoEfectivo == null) return 0;
        long dias = ChronoUnit.DAYS.between(fechaPactadaPago, fechaPagoEfectivo);
        return dias > 0 ? dias : 0;
    }

    public double calcularPenalidad() {
        long dias = diasAtraso();
        return montoSolicitado * 0.02 * dias;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Tipo de cliente: " + this.getClass().getSimpleName());
        System.out.println("Monto solicitado: $" + montoSolicitado);
        System.out.println("Fecha del préstamo: " + fechaPrestamo);
        System.out.println("Fecha pactada de pago: " + fechaPactadaPago);
    }
}