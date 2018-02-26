package Medicable;
public class TestMedicine {
    public static void main(String[] args) {
        String[] ingredient = {"Ingredient1","Ingredient2"};
        Medicine1 med= new CommonYarrow("Plant", 001, "Common Yarrow", ingredient);
        System.out.println(med.toString());
        System.out.println("\n");
        Medicine1 med2= new CommonHollyhock("Plant", 002, "Common Hollyrock", ingredient);
        System.out.println(med2.toString());
    }
}
