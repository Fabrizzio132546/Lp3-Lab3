package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Habitacion h1 = new Habitacion("101", "Suite");
        Cliente c1 = new Cliente("Fabrizzio");

        ControladorReservas controlador = new ControladorReservas();

        controlador.crearReserva(h1, c1, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 15));
        controlador.crearReserva(h1, new Cliente("Lizardo"), LocalDate.of(2025, 9, 12), LocalDate.of(2025, 9, 14));
    }
}
