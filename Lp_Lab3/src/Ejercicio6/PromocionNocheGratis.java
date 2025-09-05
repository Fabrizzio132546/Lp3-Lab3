package Ejercicio6;

public class PromocionNocheGratis implements Promocion {
    private int nochesTotales;

    public PromocionNocheGratis(int nochesTotales) {
        this.nochesTotales = nochesTotales;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        if (nochesTotales >= 5) {
            double precioPorNoche = precioOriginal / nochesTotales;
            return precioOriginal - precioPorNoche; 
        }
        return precioOriginal;
    }
}
