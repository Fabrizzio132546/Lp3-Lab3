package Ejercicio1;

import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private LocalDate inicio;
    private LocalDate fin;

    public Reserva(Cliente cliente, LocalDate inicio, LocalDate fin) {
        this.cliente = cliente;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public boolean seCruzaCon(LocalDate nuevoInicio, LocalDate nuevoFin) {
        return !(nuevoFin.isBefore(inicio) || nuevoInicio.isAfter(fin));
    }
}
