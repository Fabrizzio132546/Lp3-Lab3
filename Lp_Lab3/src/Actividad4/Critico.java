package Actividad4;



public class Critico implements DamageCalculator {
    private DamageCalculator baseCalculator;

    public Critico(DamageCalculator baseCalculator) {
        this.baseCalculator = baseCalculator;
    }

    @Override
    public int calculate(Weapon weapon, int level, Elemental element) {
        int damage = baseCalculator.calculate(weapon, level, element);
        if (Math.random() < 0.2) { 
            System.out.println("Golpe critico:");
            return damage * 2;
        }
        return damage;
    }
}
