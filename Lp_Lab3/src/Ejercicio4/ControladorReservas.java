package Ejercicio4;

import java.time.LocalDate;

public class ControladorReservas {

    public void crearReserva(Habitacion habitacion, Cliente cliente, LocalDate inicio, LocalDate fin, PoliticaCancelacion politica) {
        if (habitacion.estaDisponible(inicio, fin)) {
            Reserva reserva = new Reserva(cliente, inicio, fin, politica);
            habitacion.asignarReserva(reserva);
            System.out.println("Reserva creada: " + cliente.getNombre() +
                               " en habitacion " + habitacion.getIdHabitacion() +
                               " (" + habitacion.getTipo() + ")");
        } else {
            System.out.println("No se ha reservado, habitacion no disponible");
        }
    }

    public void cancelarReserva(Habitacion habitacion, Reserva reserva) {
        if (reserva.cancelar()) {
            habitacion.liberarReserva(reserva);
        }
    }
}
