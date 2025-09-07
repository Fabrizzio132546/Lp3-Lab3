package Actividad3;

public class EspadaDCalcular implements DamageCalculator {
    
    @Override
    public int calculate(Weapon weapon, int level) {
        return weapon.getBaseDamage() + (level * 5);
    }
}

