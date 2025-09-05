package Actividad4;

public class ArcoDCalcular implements DamageCalculator {
    @Override
    public int calculate(Weapon weapon, int level, Elemental element) {
        int base = weapon.getBaseDamage() + (level * 3);
        return element != null ? element.damageElemental(base) : base;
    }
}
