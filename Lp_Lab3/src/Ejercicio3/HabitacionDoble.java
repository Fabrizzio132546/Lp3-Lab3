package Ejercicio3;

public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(String idHabitacion, double precioBase) {
        super(idHabitacion, "Doble", precioBase);
    }

    @Override
    public double calcularPrecioFinal(int noches) {

        if (noches > 5) {
            return (getPrecioBase() * noches) * 0.9;
        }
        return getPrecioBase() * noches;
    }
}
