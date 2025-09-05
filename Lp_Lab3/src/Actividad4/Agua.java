package Actividad4;


public class Agua implements Elemental {
    @Override
    public int damageElemental(int baseDamage) {
        return baseDamage + 5; 
    }
}
