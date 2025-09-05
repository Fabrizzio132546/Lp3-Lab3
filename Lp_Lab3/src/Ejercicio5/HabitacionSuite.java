package Ejercicio5;


public class HabitacionSuite extends Habitacion implements ServicioLimpieza, ServicioComida, ServicioLavanderia {

    public HabitacionSuite(String idHabitacion, double precioBase) {
        super(idHabitacion, "Suite", precioBase);
    }

    @Override
    public double calcularPrecioFinal(int noches) {
        double recargoVIP = 50.0;
        return (getPrecioBase() * noches) + recargoVIP;
    }

    @Override
    public void solicitarLimpieza() {
        System.out.println("Limpieza premium solicitada para suite " + getIdHabitacion());
    }

    @Override
    public void solicitarComida(String plato) {
        System.out.println("Comida '" + plato + "' solicitada en suite " + getIdHabitacion());
    }

    @Override
    public void solicitarLavanderia(String prenda) {
        System.out.println("Lavandería VIP para " + prenda + " en suite " + getIdHabitacion());
    }
}
