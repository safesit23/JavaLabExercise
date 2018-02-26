package ch6.beforefinal;
public abstract class Medicine implements MedicAble{
    private int madicId;
    private String name;
    private String[] ingredients;

    public Medicine(int madicId, String name, String[] ingredients) {
        this.madicId = madicId;
        this.name = name;
        this.ingredients = ingredients;
    }

    public int getMadicId() {
        return madicId;
    }

    public void setMadicId(int madicId) {
        this.madicId = madicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Medicine{" + "madicId=" + madicId + ", name=" + name + ", ingredients=" + ingredients + '}';
    }
    
    
}
