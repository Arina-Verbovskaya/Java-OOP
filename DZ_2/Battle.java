package DZ_2;

import java.util.LinkedList;

public class Battle {
    private Warrior attacker;
    private Warrior defender;
    private Warrior temp;

    private Warrior tempAttacker;
    private Warrior tempDefender;
    private LinkedList champions = new LinkedList<>();

    public Battle(Team attackers, Team defenders) {
        for (int i = 0; i < attackers.persons.size(); i++) {
            tempAttacker = (Warrior) attackers.persons.get(i);
            for (int j = 0; j < defenders.persons.size(); j++) {
                tempDefender = (Warrior) defenders.persons.get(i);
                this.attacker = tempAttacker;
                this.defender = tempDefender;
            }
            champions = run();
        }
        System.out.println("Champions! " + champions);
    }

    public LinkedList run(){
        while (true) {
            int attack = attacker.harm();
            temp = attacker;
            if (defender.secondWeapon != null) {
                if (!defender.secondWeapon.block()) {
                    defender.reduceHp(attack);
                    System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", temp.getName(), attack, defender.getName(), defender.getHp());
                    if (!defender.isAlive()) {
                        champions.add(attacker.getName());
                        System.out.printf("\nWarrior %s is dead, %s winner! ", defender.getName(), temp.getName());
                        System.out.println(temp);
                        break;
                    } else {
                        attacker = defender;
                        defender = temp;
                    }
                } else {
                    System.out.printf("%s blocked %s attack\n",defender.getName(), attacker.getName());
                    attacker = defender;
                    defender = temp;
                }
            }
            else {
                defender.reduceHp(attack);
                System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP\n ", temp.getName(), attack, defender.getName(), defender.getHp());
                if (!defender.isAlive()) {
                    champions.add(attacker.getName());
                    System.out.printf("\nWarrior %s is dead, %s winner! ", defender.getName(), temp.getName());
                    System.out.println(temp);
                    break;
                } else {
                    attacker = defender;
                    defender = temp;
                }
            }
        }
        return champions;
    }
}
