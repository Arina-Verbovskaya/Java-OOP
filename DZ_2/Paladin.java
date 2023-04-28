package DZ_2;

public class Paladin extends Warrior<Knife, Shield>{
    public Paladin(String name, int hp, Knife weapon, Shield secondWeapon) {
        super(name, hp, weapon, secondWeapon);
    }

    @Override
    public String toString() {
        return "Paladin: " +
                super.toString();
    }
}
