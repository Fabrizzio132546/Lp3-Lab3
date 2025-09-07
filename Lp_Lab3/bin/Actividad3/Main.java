package Actividad3;

public class Main {
    
    public static void main(String[] args) {

        Weapon espada = new Espada(50);
        Weapon arco = new Arco(30);

        DamageCalculator espadaCalc = new EspadaDCalcular();
        DamageCalculator arcoCalc = new ArcoDCalcular();

        int nivel = 4;

        int damageEspada = espadaCalc.calculate(espada, nivel);
        int damageArco = arcoCalc.calculate(arco, nivel);

        System.out.println("Arma: Espada,  Daño base: " + espada.getBaseDamage() +
                           ", Nivel: " + nivel + ", Daño total: " + damageEspada);

        System.out.println("Arma: Arco,  Daño base: " + arco.getBaseDamage() +
                           ", Nivel: " + nivel + ", Daño total: " + damageArco);
    }
}

