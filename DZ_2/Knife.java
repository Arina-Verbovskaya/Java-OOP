package DZ_2;

public class Knife implements Weapon{

    @Override
    public Integer damage() {
        return 20;
    }
    public String toString(){
        return "Knife " +
                damage();
    }
}
