package Ejercicio6;

public class PromocionClienteFrecuente implements Promocion {
    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal * 0.9; 
    }
}
