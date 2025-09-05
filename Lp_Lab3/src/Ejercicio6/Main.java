package Ejercicio6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana Torres", "ana@example.com");

        Habitacion h1 = new HabitacionIndividual("101", 80.0);
        Habitacion h2 = new HabitacionDoble("202", 150.0);
        Habitacion h3 = new HabitacionSuite("303", 300.0);

        Reserva r1 = new Reserva(cliente, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 12), new PoliticaCancelacionFlexible());
        Reserva r2 = new Reserva(cliente, LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 20), new PoliticaCancelacionModerada());

        h1.asignarReserva(r1);
        h2.asignarReserva(r2);

        ControladorReservas controlador = new ControladorReservas();
        controlador.cancelarReserva(h1, r1);
        controlador.cancelarReserva(h2, r2);

        CalculadoraPrecioHabitacion calculadora = new CalculadoraPrecioHabitacion();

        double precio1 = calculadora.calcularPrecio(h1, 3, new PromocionClienteFrecuente());
        System.out.println("Precio final con promoción Cliente Frecuente: " + precio1);

        double precio2 = calculadora.calcularPrecio(h2, 6, new PromocionNocheGratis(5));
        System.out.println("Precio final con promoción Noche Gratis: " + precio2);

        if (h2 instanceof ServicioLavanderia) {
            ((ServicioLavanderia) h2).solicitarLavanderia("Camisa");
        }

        if (h3 instanceof ServicioComida) {
            ((ServicioComida) h3).solicitarComida("Pizza Margarita");
        }

        NotificadorReserva notificadorCorreo = new NotificadorReserva(new EnviadorCorreo());
        notificadorCorreo.notificar("Se ha confirmado la reserva para " + cliente.getNombre());

        NotificadorReserva notificadorSMS = new NotificadorReserva(new EnviadorSMS());
        notificadorSMS.notificar("Recordatorio: check-in mañana");
    }
}






