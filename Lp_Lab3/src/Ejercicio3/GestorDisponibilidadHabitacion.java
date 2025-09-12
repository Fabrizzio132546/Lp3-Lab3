package Ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class GestorDisponibilidadHabitacion {
    private Habitacion habitacion;

    public GestorDisponibilidadHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public boolean verificarDisponibilidad(LocalDate inicio, LocalDate fin) {
        List<Reserva> reservas = habitacion.getReservas();
        for (Reserva r : reservas) {
            if (r.seCruzaCon(inicio, fin)) {
                return false;
            }
        }
        return true;
    }
}
