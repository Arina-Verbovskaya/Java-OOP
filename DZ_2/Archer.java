package DZ_2;

public class Archer extends  Warrior <Trowing, Shield> {
    public Archer(String name, int hp, Trowing trowing, Shield shield) {
        super(name, hp, trowing, shield = null);
    }
    public int getRange(){
        return random.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer " +
                super.toString();
    }
}
