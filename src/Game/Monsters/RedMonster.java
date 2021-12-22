package Game.Monsters;

public class RedMonster {
    private int damage;
    private String weapon;

    public RedMonster(int damage, String weapon) {
        this.damage = damage*5;
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
