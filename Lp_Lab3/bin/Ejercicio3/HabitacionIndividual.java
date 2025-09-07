package Ejercicio3;

public class HabitacionIndividual extends Habitacion {

    public HabitacionIndividual(String idHabitacion, double precioBase) {
        super(idHabitacion, "Individual", precioBase);
    }

    @Override
    public double calcularPrecioFinal(int noches) {
        return getPrecioBase() * noches;
    }
}

