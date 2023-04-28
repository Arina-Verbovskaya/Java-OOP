package DZ_2;

public abstract class Trowing implements Weapon{
    private int distance;


    public Trowing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
    @Override
    public  String toString(){
        return "Trowing" +
                " distance: " + distance +
                " damage: " + damage();
    }

    public abstract boolean block();
}
