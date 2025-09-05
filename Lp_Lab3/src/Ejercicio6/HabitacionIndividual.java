package Ejercicio6;


public class HabitacionIndividual extends Habitacion implements ServicioLimpieza {

    public HabitacionIndividual(String idHabitacion, double precioBase) {
        super(idHabitacion, "Individual", precioBase);
    }


    @Override
    public void solicitarLimpieza() {
        System.out.println("Limpieza solicitada para habitación individual " + getIdHabitacion());
    }
}
