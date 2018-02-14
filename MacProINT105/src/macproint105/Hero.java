package macproint105;
public class Hero {
    private String name;
    private int health;
    private Weapon weapon;
    private Armor armor;

    public Hero(String name, int health, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }
    
}
