package macproint105;
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

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Armor{" + "name=" + name + ", armor=" + armor + '}';
    }
    
    
}
