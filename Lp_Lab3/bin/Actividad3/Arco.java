package Actividad3;

public class Arco implements Weapon {
    private int baseDamage;

    public Arco(int baseDamage) {
        this.baseDamage = baseDamage;
    }
    @Override
    public int getBaseDamage() {
        return baseDamage;
    }
}
