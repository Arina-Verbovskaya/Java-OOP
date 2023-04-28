package DZ_2;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Paladin> paladins = new Team<>();
        archers.addPersons(new Archer("Robbin", 120, new Bow(20), new Shield()));
        archers.addPersons(new Archer("Goblin", 105, new Bow(15), new Shield()));
        paladins.addPersons(new Paladin("Dominik", 100, new Knife(), new Shield()));
        paladins.addPersons(new Paladin("Keskulla", 100, new Knife(), new Shield()));
        Paladin paladin1 = new Paladin("Robbin", 100, new Knife(), new Shield());
        Paladin paladin2 = new Paladin("Marmot", 100, new Knife(), null);
        Battle fight  = new Battle(archers, paladins);
    }
}
