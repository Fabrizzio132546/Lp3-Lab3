package Ejercicio6;

public class PromocionTemporadaAlta implements Promocion {
    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal * 1.2; 
    }
}
