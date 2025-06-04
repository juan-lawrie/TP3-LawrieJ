package resol.LawrieJ.Ejercicio2;

public class Vehiculo {
    private String marca;
    private int modelo;
    private double kilometros;

    public Vehiculo(String marca, int modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilómetros: " + kilometros);
    }

    public void recorrer(int kms) {
        kilometros += kms;
        System.out.println("El vehículo recorrió " + kms + " km. Nuevo kilometraje: " + kilometros);
    }

    public void proximoServicio() {
        double proximo = Math.ceil(kilometros / 10000) * 10000;
        if (proximo == kilometros) {
            proximo += 10000;
        }
        System.out.println("Próximo servicio a los " + (int)proximo + " km.");
    }
}
