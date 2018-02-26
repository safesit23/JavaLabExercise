package ch6.beforefinal;
public class Paracetamol extends Medicine{
    private double size;

    public Paracetamol(String chemicalFormula, double size, int madicId, String name, String[] ingredients) {
        super(madicId, name, ingredients);

        this.size = size;
    }

    public String medicPropertise(){
        return "Paracetamol is used for reducing fever in people of all ages";
    }
    @Override
    public String[] medicIngregients(){
        return getIngredients();
    }
    public String medicWarning(){
        return "Do not use over size";
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+"\nParacetamol{" + ", size=" + size + '}';
    }
}
