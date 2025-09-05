package Actividad4;


public class Battle {
    public static void start(Jugador player, Enemigo enemy) {
        System.out.println("Comienza la pelea entre " + player + " y " + enemy);
        while (player.isAlive() && enemy.isAlive()) {
            player.attack(enemy);
            if (enemy.isAlive()) {
                enemy.attack(player);
            }
        }
        System.out.println(player.isAlive() ? "Gana el jugador" : "Gana el enemigo");
    }
}
