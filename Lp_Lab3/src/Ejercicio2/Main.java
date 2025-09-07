package Ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Habitacion hab1 = new Habitacion("101", "Doble", 120.0);
        Cliente cli1 = new Cliente("Fabrizzio", "992036487");

        ControladorReservas controlador = new ControladorReservas();

        Reserva r1 = new Reserva(cli1, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 15), new PoliticaCancelacionFlexible());
        hab1.asignarReserva(r1);

        controlador.cancelarReserva(hab1, r1);
    }
}
