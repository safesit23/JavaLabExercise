package heroesbattle;
public class Hero {
    private String name;
    private Weapon weapon;
    private Armor armor;
    private int health;

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
        
    }

    public void changeArmor(Armor armor){
        this.armor=armor;
    }
    
    public void changeWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    
    public int getHealth() {
        return health;
    }

    public int getAttactPower() {
        return weapon.getPower();
    }
    
    public void attacted(int power){
        int enemy=power-this.armor.getArmor();
        if(enemy>0){
            this.health=this.health-enemy;
        }
    }
    
    public void attacted(Hero enemy){
        int value=enemy.getAttactPower()-this.armor.getArmor();
        if(value>0){
            this.health=this.health-value;
        }
    }
    
}
