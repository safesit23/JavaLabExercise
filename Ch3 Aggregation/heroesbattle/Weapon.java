package heroesbattle;
public class Weapon {
    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", power=" + power + '}';
    }
    
}
