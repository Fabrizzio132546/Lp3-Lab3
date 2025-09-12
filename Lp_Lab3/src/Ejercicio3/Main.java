package Ejercicio3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("FLizardo", "945928475");
        ControladorReservas controlador = new ControladorReservas();

        Habitacion hab1 = new HabitacionIndividual("101", 80.0);
        Habitacion hab2 = new HabitacionDoble("202", 150.0);
        Habitacion hab3 = new HabitacionSuite("303", 300.0);

        Reserva r1 = new Reserva(cli1, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 12), new PoliticaCancelacionFlexible());
        hab1.asignarReserva(r1);

        Reserva r2 = new Reserva(cli1, LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 20), new PoliticaCancelacionModerada());
        hab2.asignarReserva(r2);

        Reserva r3 = new Reserva(cli1, LocalDate.of(2025, 9, 22), LocalDate.of(2025, 9, 25), new PoliticaCancelacionEstricta());
        hab3.asignarReserva(r3);

        controlador.cancelarReserva(hab1, r1);
        controlador.cancelarReserva(hab2, r2);
        controlador.cancelarReserva(hab3, r3);

        System.out.println("Precio Individual: " + hab1.calcularPrecioFinal(2));
        System.out.println("Precio Doble: " + hab2.calcularPrecioFinal(6));
        System.out.println("Precio Suite: " + hab3.calcularPrecioFinal(3));
    }
}
