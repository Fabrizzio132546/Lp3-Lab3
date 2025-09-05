package Ejercicio6;

public class PromocionNula implements Promocion {
    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal;
    }
}
