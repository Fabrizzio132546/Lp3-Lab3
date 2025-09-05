package Actividad4;


public class Enemigo {
    private String type;
    private int health;
    private int level;
    private Weapon weapon;
    private DamageCalculator calculator;
    private Elemental element;

    public Enemigo(String type, int health, int level, Weapon weapon,
                   DamageCalculator calculator, Elemental element) {
        this.type = type;
        this.health = health;
        this.level = level;
        this.weapon = weapon;
        this.calculator = calculator;
        this.element = element;
    }

    public void attack(Jugador player) {
        int dmg = calculator.calculate(weapon, level, element);
        player.receiveDamage(dmg);
        System.out.println(type + " ataca causando " + dmg + " de daño");
    }

    public void receiveDamage(int dmg) {
        health -= dmg;
        if (health < 0) { 
            health = 0;
        }
        System.out.println(type + " recibe " + dmg + " de daño, su vida restante: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Enemigo " + type;
    }
}