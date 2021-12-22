package Game.Monsters;

public class GreenMonster {

    private int damage;
    private String weapon;

    public GreenMonster(int damage, String weapon) {
        this.damage = damage;
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
