package resol.LawrieJ.Ejercicio5;

import java.time.LocalDate;

public class EmpleadoPublico extends Cliente {
    public EmpleadoPublico(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, montoSolicitado, fechaPactadaPago);
    }

    @Override
    public double calcularInteres(double monto, int meses) {
        return monto * 0.10 * meses;
    }
}