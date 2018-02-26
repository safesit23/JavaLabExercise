package Medicable;

public class CommonYarrow extends Herb{

    public CommonYarrow(String type, int medicineId, String name, String[] ingredient) {
        super(type, medicineId, name, ingredient);
    }
    
    public String medicProperties1(){
        return "Purported to be a diaphoretic, astringent,[5] tonic, stimulant and mild aromatic.";
    }
    public String[] medicIngredient(){
        return super.getIngredient();
    }
    public String medicWarning(){
        return "USE USE USE";
    }

    @Override
    public String toString() {
        return super.toString()+"CommonYarrow{" + '}'+medicProperties1()+"\n"+medicWarning();
    }
    
}
