package Ch4Inheritance;
public class Pet extends Animal{
    private String ownerName;

    public Pet(String ownerName, String name) {
        super(name);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}