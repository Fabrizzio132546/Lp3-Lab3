package Ejercicio4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Fabrizzio", "992036487");
        ControladorReservas controlador = new ControladorReservas();

        Habitacion h1 = new HabitacionIndividual("101", 80.0);
        Habitacion h2 = new HabitacionDoble("202", 150.0);
        Habitacion h3 = new HabitacionSuite("303", 300.0);

        Reserva r1 = new Reserva(cli1, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 12), new PoliticaCancelacionFlexible());
        Reserva r2 = new Reserva(cli1, LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 20), new PoliticaCancelacionModerada());
        Reserva r3 = new Reserva(cli1, LocalDate.of(2025, 9, 22), LocalDate.of(2025, 9, 25), new PoliticaCancelacionEstricta());

        h1.asignarReserva(r1);
        h2.asignarReserva(r2);
        h3.asignarReserva(r3);

        controlador.cancelarReserva(h1, r1);
        controlador.cancelarReserva(h2, r2);
        controlador.cancelarReserva(h3, r3);

        if (h1 instanceof ServicioLimpieza) {
            ((ServicioLimpieza) h1).solicitarLimpieza();
        }

        if (h2 instanceof ServicioLavanderia) {
            ((ServicioLavanderia) h2).solicitarLavanderia("camisa");
        }

        if (h3 instanceof ServicioComida) {
            ((ServicioComida) h3).solicitarComida("Pizza");
        }

        if (h3 instanceof ServicioLavanderia) {
            ((ServicioLavanderia) h3).solicitarLavanderia("vestido");
        }
    }
}
