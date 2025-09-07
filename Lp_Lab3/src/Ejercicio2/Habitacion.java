package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String idHabitacion;
    private String tipo;
    private double precioBase;
    private GestorDisponibilidadHabitacion gestorDisponibilidad;
    private List<Reserva> reservas;

    public Habitacion(String idHabitacion, String tipo, double precioBase) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.reservas = new ArrayList<>();
        this.gestorDisponibilidad = new GestorDisponibilidadHabitacion(this);
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public GestorDisponibilidadHabitacion getGestorDisponibilidad() {
        return gestorDisponibilidad;
    }

    public boolean estaDisponible(java.time.LocalDate inicio, java.time.LocalDate fin) {
        return gestorDisponibilidad.verificarDisponibilidad(inicio, fin);
    }

    public void asignarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void liberarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}
