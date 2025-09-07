package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorDisponibilidadHabitacion {
    private List<Reserva> reservas;

    public GestorDisponibilidadHabitacion() {
        this.reservas = new ArrayList<>();
    }

    public boolean verificarDisponibilidad(LocalDate inicio, LocalDate fin) {
        for (Reserva r : reservas) {
            if (r.seCruzaCon(inicio, fin)) {
                return false;
            }
        }
        return true;
    }

    public void marcarReservada(Reserva reserva) {
        reservas.add(reserva);
    }

    public void liberar(Reserva reserva) {
        reservas.remove(reserva);
    }
}
