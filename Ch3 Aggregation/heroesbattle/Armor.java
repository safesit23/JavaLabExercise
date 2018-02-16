package heroesbattle;
public class Armor {
    private String name;
    private int armor;

    public Armor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "Armor{" + "name=" + name + ", armor=" + armor + '}';
    }
    
}
