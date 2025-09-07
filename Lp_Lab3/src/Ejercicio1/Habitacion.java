package Ejercicio1;

import java.time.LocalDate;

public class Habitacion {
    private String idHabitacion;
    private String tipo; 
    private GestorDisponibilidadHabitacion gestorDisponibilidad;

    public Habitacion(String idHabitacion, String tipo) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.gestorDisponibilidad = new GestorDisponibilidadHabitacion();
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean estaDisponible(LocalDate inicio, LocalDate fin) {
        return gestorDisponibilidad.verificarDisponibilidad(inicio, fin);
    }

    public void asignarReserva(Reserva r) {
        gestorDisponibilidad.marcarReservada(r);
    }

    public void liberarReserva(Reserva r) {
        gestorDisponibilidad.liberar(r);
    }
}
