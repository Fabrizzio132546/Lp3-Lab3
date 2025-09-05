package Actividad4;


public class Main {
    public static void main(String[] args) {
        Weapon espada = new Espada(20);
        Weapon arco = new Arco(15);

        DamageCalculator espadaCalc = new Critico(new EspadaDCalcular());
        DamageCalculator arcoCalc = new Critico(new ArcoDCalcular());

        Elemental fuego = new Fuego();
        Elemental agua = new Agua();
        
        Jugador jugador = new Jugador("Lizardo", 100, 3, espada, espadaCalc, fuego);
        Enemigo enemigo = new Enemigo("Fabrizzio", 120, 5, arco, arcoCalc, agua);

        Battle.start(jugador, enemigo);
    }
}
