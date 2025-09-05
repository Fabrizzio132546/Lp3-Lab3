package Actividad4;

public class Jugador {
    private String name;
    private int health;
    private int level;
    private Weapon weapon;
    private DamageCalculator calculator;
    private Elemental element;

    public Jugador(String name, int health, int level, Weapon weapon,
                   DamageCalculator calculator, Elemental element) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.weapon = weapon;
        this.calculator = calculator;
        this.element = element;
    }

    public void attack(Enemigo enemy) {
        int dmg = calculator.calculate(weapon, level, element);
        enemy.receiveDamage(dmg);
        System.out.println(name + " ataca causando " + dmg + " de daño");
    }

    public void receiveDamage(int dmg) {
        health -= dmg;
        if (health < 0) { 
            health = 0;
        }
        System.out.println(name + " recibe " + dmg + " de daño, su vida restante: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Jugador " + name;
    }
}