package resol.LawrieJ.Ejercicio4;


 public class Empleado  {

        private int dni;
        private String nombre;
        private double sueldoBase;
        private int antiguedad;

        public Empleado(int dni, String nombre, double sueldoBase, int antiguedad) {
            this.dni = dni;
            this.nombre = nombre;
            this.sueldoBase = sueldoBase;
            this.antiguedad = antiguedad;
        }

        public double calcularSueldo() {
            double incremento = 0.02 * sueldoBase * antiguedad; // 2% por año de antigüedad
            return sueldoBase + incremento;
        }

        public void mostrarDetalles() {
            System.out.println("Empleado: " + nombre);
            System.out.println("DNI: " + dni);
            System.out.println("Sueldo Base: $" + sueldoBase);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo Total: $" + calcularSueldo());
        
    }
}