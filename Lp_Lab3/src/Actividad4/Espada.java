package Actividad4;


public class Espada implements Weapon {
    private int baseDamage;

    public Espada(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }
}
