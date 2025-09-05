package Ejercicio5;

import java.time.LocalDate;



public class Reserva {
    private Cliente cliente;
    private LocalDate inicio;
    private LocalDate fin;
    private PoliticaCancelacion politicaCancelacion;

    public Reserva(Cliente cliente, LocalDate inicio, LocalDate fin, PoliticaCancelacion politica) {
        this.cliente = cliente;
        this.inicio = inicio;
        this.fin = fin;
        this.politicaCancelacion = politica;
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

    public PoliticaCancelacion getPoliticaCancelacion() {
        return politicaCancelacion;
    }


    public boolean seCruzaCon(LocalDate nuevoInicio, LocalDate nuevoFin) {
        return !(nuevoFin.isBefore(inicio) || nuevoInicio.isAfter(fin));
    }

    public boolean cancelar() {
        if (politicaCancelacion.puedeCancelar(this)) {
            double penalizacion = politicaCancelacion.calcularPenalizacion(this);
            System.out.println("Reserva cancelada. Penalización aplicada: " + (penalizacion * 100) + "%");
            return true;
        } else {
            System.out.println("No se puede cancelar la reserva (política no lo permite).");
            return false;
        }
    }
}











