package DZ_2;

import java.util.Iterator;
import java.util.LinkedList;

public class Team <T extends Person> implements Iterable <T>{
    LinkedList <T> persons = new LinkedList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }
    public Team <T> addPersons(T person){
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team { " +
                "persons: " + persons +
                " }";
    }
    public int maxRange(){
        int max = 0;
        for (T pers: this){
            if (pers instanceof Archer){
                Archer archer = (Archer) pers;
                if (archer.getRange() > max )
                    max = archer.getRange();
            }
        }
        return max;
    }
}
