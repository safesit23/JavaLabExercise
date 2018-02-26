
package Medicable;
public abstract class Medicine1 implements Medicable1{
    private int medicineId;
    private String name;
    private String[] ingredient;
    
    public abstract String[] medicIngredient();
    public abstract String medicWarning();

    public Medicine1(int medicineId, String name, String[] ingredient) {
        this.medicineId = medicineId;
        this.name = name;
        this.ingredient = ingredient;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }
    
    public String getIngredientString(){
        String message="";
        for(int i=0;i<ingredient.length;i++){
            message=message+ingredient[i]+" ,";
        }
        message=message+"\b";
        return message;
    }

    @Override
    public String toString() {
        return "Medicine1{" + "medicineId=" + medicineId + ", name=" + name + ", ingredient=" + getIngredientString() + '}'+"\n";
    }
    
}
