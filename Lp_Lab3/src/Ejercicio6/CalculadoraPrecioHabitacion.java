package Ejercicio6;

public class CalculadoraPrecioHabitacion {
    public double calcularPrecio(Habitacion habitacion, int noches, Promocion promocion) {
        double precioBase = habitacion.getPrecioBase() * noches;
        return promocion.aplicarDescuento(precioBase);
    }
}
