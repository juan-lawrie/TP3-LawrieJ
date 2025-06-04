package resol.LawrieJ.Ejercicio5;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tipo de cliente (1: General, 2: Jubilado, 3: Empleado Público): ");
        int tipo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Monto solicitado: ");
        double monto = sc.nextDouble();
        System.out.print("Cantidad de meses: ");
        int meses = sc.nextInt();
        sc.nextLine();
        System.out.print("Fecha del préstamo (AAAA-MM-DD): ");
        LocalDate fechaPrestamo = LocalDate.parse(sc.nextLine());
        System.out.print("Fecha pactada de pago (AAAA-MM-DD): ");
        LocalDate fechaPactada = LocalDate.parse(sc.nextLine());
        System.out.print("Fecha efectiva de pago (AAAA-MM-DD): ");
        LocalDate fechaEfectiva = LocalDate.parse(sc.nextLine());

        Cliente cliente;
        switch (tipo) {
            case 2:
                cliente = new Jubilado(nombre, dni, fechaPrestamo, monto, fechaPactada);
                break;
            case 3:
                cliente = new EmpleadoPublico(nombre, dni, fechaPrestamo, monto, fechaPactada);
                break;
            default:
                cliente = new ClienteGeneral(nombre, dni, fechaPrestamo, monto, fechaPactada);
        }
        cliente.setFechaPagoEfectivo(fechaEfectiva);

        System.out.println("\n--- Información del préstamo ---");
        cliente.mostrarInformacion();
        double interes = cliente.calcularInteres(monto, meses);
        System.out.println("Interés total calculado: $" + interes);

        long diasAtraso = cliente.diasAtraso();
        if (diasAtraso == 0) {
            System.out.println("Pagó en término.");
        } else {
            double penalidad = cliente.calcularPenalidad();
            System.out.println("Días de atraso: " + diasAtraso);
            System.out.println("Penalidad por atraso: $" + penalidad);
        }
        double montoFinal = monto + interes + cliente.calcularPenalidad();
        System.out.println("Monto total a pagar: $" + montoFinal);
        sc.close();
    }
}