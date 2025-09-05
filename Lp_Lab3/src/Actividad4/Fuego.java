package Actividad4;


public class Fuego implements Elemental {
    @Override
    public int damageElemental(int baseDamage) {
        return baseDamage + 10; 
    }
}
