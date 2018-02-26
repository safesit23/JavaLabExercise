package Medicable;
public abstract class Herb extends Medicine1{
    private String type;

    public Herb(String type, int medicineId, String name, String[] ingredient) {
        super(medicineId, name, ingredient);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+"Herb{" + "type=" + type + '}';
    }
    
    
}
