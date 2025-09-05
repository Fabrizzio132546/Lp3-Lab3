package Ejercicio5;


public class HabitacionDoble extends Habitacion implements ServicioLimpieza, ServicioLavanderia {

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

    @Override
    public void solicitarLimpieza() {
        System.out.println("Limpieza solicitada para habitación doble " + getIdHabitacion());
    }

    @Override
    public void solicitarLavanderia(String prenda) {
        System.out.println("Servicio de lavandería para " + prenda + " en habitación doble " + getIdHabitacion());
    }
}
