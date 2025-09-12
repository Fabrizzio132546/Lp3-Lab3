package Actividad3;

public class ArcoDCalcular implements DamageCalculator {
    @Override
    public int calculate(Weapon weapon, int level) {
        return weapon.getBaseDamage() + (level * 3);
    }
}
