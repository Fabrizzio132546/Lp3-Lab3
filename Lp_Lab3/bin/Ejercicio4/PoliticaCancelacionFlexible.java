package Ejercicio4;

import java.time.LocalDate;

public class PoliticaCancelacionFlexible implements PoliticaCancelacion {
    @Override
    public boolean puedeCancelar(Reserva reserva) {
        LocalDate hoy = LocalDate.now();

        return reserva.getInicio().isAfter(hoy.plusDays(1));
    }

    @Override
    public double calcularPenalizacion(Reserva reserva) {
        return 0.0; 
    }
}
