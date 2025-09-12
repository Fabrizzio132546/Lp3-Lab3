package Ejercicio3;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(String idHabitacion, double precioBase) {
        super(idHabitacion, "Suite", precioBase);
    }

    @Override
    public double calcularPrecioFinal(int noches) {

        double recargoVIP = 50.0;
        return (getPrecioBase() * noches) + recargoVIP;
    }
}