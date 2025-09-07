package Ejercicio3;

import java.time.LocalDate;

public class PoliticaCancelacionModerada implements PoliticaCancelacion {
    @Override
    public boolean puedeCancelar(Reserva reserva) {
        LocalDate hoy = LocalDate.now();

        return reserva.getInicio().isAfter(hoy.plusDays(3));
    }

    @Override
    public double calcularPenalizacion(Reserva reserva) {
        return 0.5; 
    }
}

