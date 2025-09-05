package Actividad4;


public class EspadaDCalcular implements DamageCalculator {
    @Override
    public int calculate(Weapon weapon, int level, Elemental element) {
        int base = weapon.getBaseDamage() + (level * 5);
        return element != null ? element.damageElemental(base) : base;
    }
}
