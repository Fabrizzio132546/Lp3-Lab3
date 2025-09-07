package Ejercicio1;

import java.time.LocalDate;

public class ControladorReservas {

    public void crearReserva(Habitacion habitacion, Cliente cliente, LocalDate inicio, LocalDate fin) {
        if (habitacion.estaDisponible(inicio, fin)) {
            Reserva reserva = new Reserva(cliente, inicio, fin);
            habitacion.asignarReserva(reserva);
            System.out.println("Reserva creada: " + cliente.getNombre() +
                               " en habitación " + habitacion.getIdHabitacion() +
                               " (" + habitacion.getTipo() + ")");
        } else {
            System.out.println("No se pudo reservar, la habitación no está disponible.");
        }
    }
}
