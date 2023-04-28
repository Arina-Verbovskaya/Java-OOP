package DZ_2;

import java.util.Random;

public class Warrior<T extends Weapon, P extends SecondWeapon> extends Person{
    protected T weapon;
    protected P secondWeapon;
    protected static Random random = new Random();
    public Warrior(String name, int hp, T weapon, P secondWeapon) {
        super(name, hp);
        this.weapon = weapon;
        this.secondWeapon = secondWeapon;
    }

    @Override
    public String toString() {
        return "Warrior " +
                "Name: " + getName() + "\n" +
                " HP: " + getHp() + "\n" +
                " weapon = " + weapon ;
    }

    public int harm(){
        int damage = weapon.damage();
        boolean isHit;
        if (damage > 0 && random.nextInt(damage) < 8) {
            damage--;
            isHit = true;
            System.out.println("Miss attack");
        }
        else isHit = false;
        if (isHit){
            damage = random.nextInt(weapon.damage() + 2);
        }
        return damage;
    }
}
